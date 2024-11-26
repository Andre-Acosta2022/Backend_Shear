package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PlanCarrera;

@Repository
public interface PlanCarreraRepository extends JpaRepository<PlanCarrera, Long>{

}
