package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Supervisor;

public interface SupervisorService {
	Supervisor create(Supervisor a);

	Supervisor update(Supervisor a);

	void delete(Long id);

	Optional<Supervisor> read(Long id);

	List<Supervisor> readAll();
}
