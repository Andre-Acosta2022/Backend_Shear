package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Linea;

@Repository
public interface LineaRepository extends JpaRepository<Linea, Long> {

}
