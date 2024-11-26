package com.example.demo.serviceimpl;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.config.JwtTokenProvider;
import com.example.demo.dao.RefreshTokenDao;
import com.example.demo.dto.LoginDto;
import com.example.demo.dto.RegisterDto;
import com.example.demo.entity.RefreshToken;
import com.example.demo.entity.Rol;
import com.example.demo.entity.Usuario;
import com.example.demo.entity.UsuarioRol;
import com.example.demo.repository.RolRepository;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.service.AuthService;

import jakarta.transaction.Transactional;


public class AuthServiceImpl implements AuthService {

	@Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenProvider jwtTokenProvider;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private RolRepository rolRepository;
    @Autowired
    private RefreshTokenDao refreshTokenDao;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Map<String, String> login(LoginDto loginDto) {
        // 1. Autenticar usuario
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword())
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // 2. Buscar el usuario para incluir datos adicionales en los tokens
        Usuario usuario = usuarioRepository.findByUsername(loginDto.getUsername())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        String nombreCompleto = usuario.getPersona().getNombre() + " " + usuario.getPersona().getApellido();

        // 3. Generar Access Token
        String accessToken = jwtTokenProvider.generateToken(authentication, nombreCompleto);

        // 4. Generar Refresh Token
        String refreshToken = jwtTokenProvider.generateRefreshToken(usuario.getUsername());

        // 5. Guardar Refresh Token en la base de datos
        RefreshToken tokenEntity = new RefreshToken();
        tokenEntity.setToken(refreshToken);
        tokenEntity.setUsuario(usuario);
        tokenEntity.setExpiryDate(new Date(System.currentTimeMillis() + 604800000)); // 7 días
        refreshTokenDao.save(tokenEntity);

        // 6. Retornar ambos tokens
        Map<String, String> tokens = new HashMap<>();
        tokens.put("accessToken", accessToken);
        tokens.put("refreshToken", refreshToken);

        return tokens;
    }

    @Override
    public String register(RegisterDto registerDto) {
        if (usuarioRepository.existsByUsername(registerDto.getUsername())) {
            throw new RuntimeException("El usuario ya existe");
        }

        // Crear y guardar usuario
        Usuario usuario = new Usuario();
        usuario.setUsername(registerDto.getUsername());
        usuario.setPassword(passwordEncoder.encode(registerDto.getPassword()));

        Rol userRole = rolRepository.findByNombre(registerDto.getRoleName())
                .orElseThrow(() -> new RuntimeException("Rol no encontrado: " + registerDto.getRoleName()));

        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(userRole);

        usuario.setUsuarioRoles(Collections.singletonList(usuarioRol));
        usuarioRepository.save(usuario);

        return "Usuario registrado con éxito con el rol: " + registerDto.getRoleName();
    }

    @Override
    public Usuario findUserByUsername(String username) {
        return usuarioRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    @Override
    @Transactional
    public void logout(String refreshToken) {
        refreshTokenDao.deleteByToken(refreshToken);
    }

    @Override
    public String refreshAccessToken(String refreshToken) {
        return jwtTokenProvider.refreshAccessToken(refreshToken);
    }

    
}