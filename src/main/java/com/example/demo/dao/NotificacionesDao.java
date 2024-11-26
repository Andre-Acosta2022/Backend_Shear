package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Notificaciones;

public interface NotificacionesDao {
	Notificaciones create(Notificaciones a);

	Notificaciones update(Notificaciones a);

	void delete(Long id);

	Optional<Notificaciones> read(Long id);

	List<Notificaciones> readAll();
}
