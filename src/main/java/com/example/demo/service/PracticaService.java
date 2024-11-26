package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Practica;


public interface PracticaService {
	Practica create(Practica a);

	Practica update(Practica a);

	void delete(Long id);

	Optional<Practica> read(Long id);

	List<Practica> readAll();
	
}
