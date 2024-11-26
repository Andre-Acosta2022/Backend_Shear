package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.EvaluacionAcademica;

public interface EvaluacionAcademicaService {
	EvaluacionAcademica create(EvaluacionAcademica a);
	EvaluacionAcademica update(EvaluacionAcademica a);
	void delete(Long id);
	Optional<EvaluacionAcademica>read(Long id);
	List<EvaluacionAcademica> readAll();
}
