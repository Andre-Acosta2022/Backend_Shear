package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Ubigeo;

public interface UbigeoDao {
	Ubigeo create(Ubigeo a);

	Ubigeo update(Ubigeo a);

	void delete(Long id);

	Optional<Ubigeo> read(Long id);

	List<Ubigeo> readAll();
}
