package com.example.demo.daoimpl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.RefreshTokenDao;
import com.example.demo.entity.RefreshToken;
import com.example.demo.repository.RefreshTokenRepository;

@Component
public class RefreshTokenDaoImpl implements RefreshTokenDao {

	@Autowired
    private RefreshTokenRepository  refreshTokenRepository;

    @Override
    public Optional<RefreshToken> findByToken(String token) {
        return refreshTokenRepository.findByToken(token);
    }

    @Override
    public void deleteByToken(String token) {
        refreshTokenRepository.deleteByToken(token);
    }

    @Override
    public void deleteByUsuarioId(Long userId) {
        refreshTokenRepository.deleteByUsuario_IdUsuario(userId);
    }

    @Override
    public RefreshToken save(RefreshToken refreshToken) {
        return refreshTokenRepository.save(refreshToken);
    }
}
