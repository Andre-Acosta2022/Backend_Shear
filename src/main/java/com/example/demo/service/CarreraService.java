package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Carrera;

public interface CarreraService {
	Carrera create(Carrera a);
	Carrera update(Carrera a);
	void delete(Long id);
	Optional<Carrera>read(Long id);
	List<Carrera> readAll();
}
