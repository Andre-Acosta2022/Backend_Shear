package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Documentacion;

public interface DocumentacionService {
	Documentacion create(Documentacion a);
	Documentacion update(Documentacion a);
	void delete(Long id);
	Optional<Documentacion> read(Long id);
	List<Documentacion> readAll();
}
