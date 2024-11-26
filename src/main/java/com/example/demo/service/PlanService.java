package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Plan;

public interface PlanService {
	Plan create(Plan a);

	Plan update(Plan a);

	void delete(Long id);

	Optional<Plan> read(Long id);

	List<Plan> readAll();
}
