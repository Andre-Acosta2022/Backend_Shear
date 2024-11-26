package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.RepresentanteLegal;

@Repository
public interface RepresentanteLegalRepository extends JpaRepository<RepresentanteLegal, Long> {

}
