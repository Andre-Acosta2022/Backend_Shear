package com.example.demo.service;

import java.util.Map;

import com.example.demo.dto.LoginDto;
import com.example.demo.dto.RegisterDto;
import com.example.demo.entity.Usuario;



public interface AuthService {
	 Map<String, String> login(LoginDto loginDto); // Devuelve Access Token y Refresh Token
	    String register(RegisterDto registerDto); // Registro de usuario
	    Usuario findUserByUsername(String username); // Buscar usuario por nombre de usuario
	    String refreshAccessToken(String refreshToken); // Generar nuevo Access Token usando Refresh Token
	    void logout(String refreshToken); // Cerrar sesión e invalidar Refresh Token
}
