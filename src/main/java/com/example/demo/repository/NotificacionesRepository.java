package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Notificaciones;

@Repository
public interface NotificacionesRepository extends JpaRepository<Notificaciones, Long> {

}
