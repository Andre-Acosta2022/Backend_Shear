package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EvaluacionAcademica;

@Repository
public interface EvaluacionAcademicaRepository extends JpaRepository<EvaluacionAcademica, Long> {

}
