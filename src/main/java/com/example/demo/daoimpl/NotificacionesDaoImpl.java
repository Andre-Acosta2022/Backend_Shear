package com.example.demo.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.NotificacionesDao;
import com.example.demo.entity.Notificaciones;
import com.example.demo.repository.NotificacionesRepository;

@Component
public class NotificacionesDaoImpl implements NotificacionesDao {

	@Autowired
	private NotificacionesRepository notificacionesrepository;

	@Override
	public Notificaciones create(Notificaciones a) {
		// TODO Auto-generated method stub
		return notificacionesrepository.save(a);
	}

	@Override
	public Notificaciones update(Notificaciones a) {
		// TODO Auto-generated method stub
		return notificacionesrepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		notificacionesrepository.deleteById(id);
	}

	@Override
	public Optional<Notificaciones> read(Long id) {
		// TODO Auto-generated method stub
		return notificacionesrepository.findById(id);
	}

	@Override
	public List<Notificaciones> readAll() {
		// TODO Auto-generated method stub
		return notificacionesrepository.findAll();
	}

}