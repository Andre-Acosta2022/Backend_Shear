package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.EstadoPPP;

public interface EstadoPPPDao {
	EstadoPPP create(EstadoPPP a);
	EstadoPPP update(EstadoPPP a);
	void delete(Long id);
	Optional<EstadoPPP> read(Long id);
	List<EstadoPPP> readAll();
}
