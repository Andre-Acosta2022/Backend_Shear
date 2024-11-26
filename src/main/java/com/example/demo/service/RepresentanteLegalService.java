package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.RepresentanteLegal;

public interface RepresentanteLegalService {
	RepresentanteLegal create(RepresentanteLegal a);

	RepresentanteLegal update(RepresentanteLegal a);

	void delete(Long id);

	Optional<RepresentanteLegal> read(Long id);

	List<RepresentanteLegal> readAll();
}
