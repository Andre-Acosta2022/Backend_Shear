package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Ubigeo;

public interface UbigeoService {
	Ubigeo create(Ubigeo a);

	Ubigeo update(Ubigeo a);

	void delete(Long id);

	Optional<Ubigeo> read(Long id);

	List<Ubigeo> readAll();
}
