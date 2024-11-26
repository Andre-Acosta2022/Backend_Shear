package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Supervisor;

public interface SupervisorDao {
	Supervisor create(Supervisor a);

	Supervisor update(Supervisor a);

	void delete(Long id);

	Optional<Supervisor> read(Long id);

	List<Supervisor> readAll();
}
