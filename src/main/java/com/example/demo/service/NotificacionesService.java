package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Notificaciones;

public interface NotificacionesService {
	Notificaciones create(Notificaciones a);

	Notificaciones update(Notificaciones a);

	void delete(Long id);

	Optional<Notificaciones> read(Long id);

	List<Notificaciones> readAll();
}
