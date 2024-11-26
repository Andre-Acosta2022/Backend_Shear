package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Practicante;

@Repository
public interface PracticanteRepository extends JpaRepository<Practicante, Long> {

}
