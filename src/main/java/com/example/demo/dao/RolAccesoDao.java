package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.RolAcceso;

public interface RolAccesoDao {
	RolAcceso create(RolAcceso a);

	RolAcceso update(RolAcceso a);

	void delete(Long id);

	Optional<RolAcceso> read(Long id);

	List<RolAcceso> readAll();
}
