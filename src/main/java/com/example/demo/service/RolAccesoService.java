package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.RolAcceso;

public interface RolAccesoService {
	RolAcceso create(RolAcceso a);

	RolAcceso update(RolAcceso a);

	void delete(Long id);

	Optional<RolAcceso> read(Long id);

	List<RolAcceso> readAll();
}
