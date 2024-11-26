package com.example.demo.dao;

import java.util.Optional;

import com.example.demo.entity.RefreshToken;



public interface RefreshTokenDao {
	Optional<RefreshToken> findByToken(String token);
    void deleteByToken(String token);
    void deleteByUsuarioId(Long userId);
    RefreshToken save(RefreshToken refreshToken);
}
