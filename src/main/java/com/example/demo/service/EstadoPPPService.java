package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.EstadoPPP;

public interface EstadoPPPService {
	EstadoPPP create(EstadoPPP a);
	EstadoPPP update(EstadoPPP a);
	void delete(Long id);
	Optional<EstadoPPP> read(Long id);
	List<EstadoPPP> readAll();
}
