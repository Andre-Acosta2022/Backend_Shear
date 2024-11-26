package com.example.demo.config;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;



@Component
public class CustomUserDetailsService implements UserDetailsService {
	 @Autowired
	    private UsuarioRepository userRepository;

	    @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

	    	Usuario user = userRepository.findByUsername(username)
	                .orElseThrow(() -> new UsernameNotFoundException("User not exists by Username or Email"));

	    	Set<GrantedAuthority> authorities = user.getUsuarioRoles().stream()
	    		    .map(usuario_rol -> new SimpleGrantedAuthority("ROLE_" + usuario_rol.getRol().getNombre())) // Usa getRol().getNombre() para obtener el nombre del rol
	    		    .collect(Collectors.toSet());

	    		return new org.springframework.security.core.userdetails.User(
	    		    username,
	    		    user.getPassword(),
	    		    authorities
	    		);

	    }
}
