package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Carrera;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long> {

}
