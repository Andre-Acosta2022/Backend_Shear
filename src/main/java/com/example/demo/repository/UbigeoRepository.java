package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Ubigeo;

@Repository
public interface UbigeoRepository extends JpaRepository<Ubigeo, Long>{
	Ubigeo findByDepartamentoAndProvinciaAndDistrito(String departamento, String provincia, String distrito);
}
