package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EstadoPPP;

@Repository
public interface EstadoPPPRepository extends JpaRepository<EstadoPPP, Long> {

}
