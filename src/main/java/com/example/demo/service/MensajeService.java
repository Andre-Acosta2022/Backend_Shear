package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Mensaje;

public interface MensajeService {
	Mensaje create(Mensaje a);

	Mensaje update(Mensaje a);

	void delete(Long id);

	Optional<Mensaje> read(Long id);

	List<Mensaje> readAll();
}
