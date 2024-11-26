package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.PlanCarrera;

public interface PlanCarreraDao {
	PlanCarrera create(PlanCarrera a);
	PlanCarrera update(PlanCarrera a);
	void delete(Long id);
	Optional<PlanCarrera> read(Long id);
	List<PlanCarrera> readAll();
}
