package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.RolAcceso;

@Repository
public interface RolAccesoRepository extends JpaRepository<RolAcceso, Long>{

}
