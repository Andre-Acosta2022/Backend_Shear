package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Acceso;

public interface AccesoDao {
	Acceso create(Acceso a);

	Acceso update(Acceso a);

	void delete(Long id);

	Optional<Acceso> read(Long id);

	List<Acceso> readAll();
}
