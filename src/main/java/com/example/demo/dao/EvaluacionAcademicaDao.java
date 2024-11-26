package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.EvaluacionAcademica;

public interface EvaluacionAcademicaDao {
	EvaluacionAcademica create(EvaluacionAcademica a);

	EvaluacionAcademica update(EvaluacionAcademica a);

	void delete(Long id);

	Optional<EvaluacionAcademica> read(Long id);

	List<EvaluacionAcademica> readAll();
}
