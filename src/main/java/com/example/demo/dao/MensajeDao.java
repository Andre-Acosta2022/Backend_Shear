package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Mensaje;

public interface MensajeDao {
	Mensaje create(Mensaje a);

	Mensaje update(Mensaje a);

	void delete(Long id);

	Optional<Mensaje> read(Long id);

	List<Mensaje> readAll();
}
