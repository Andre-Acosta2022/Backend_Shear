package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.NotificacionesDao;
import com.example.demo.entity.Notificaciones;
import com.example.demo.service.NotificacionesService;

@Service
public class NotificacionesServiceImpl implements NotificacionesService {

	@Autowired
	private NotificacionesDao notificacionesdao;
	
	@Override
	public Notificaciones create(Notificaciones a) {
		// TODO Auto-generated method stub
		return notificacionesdao.create(a);
	}

	@Override
	public Notificaciones update(Notificaciones a) {
		// TODO Auto-generated method stub
		return notificacionesdao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		notificacionesdao.delete(id);
	}

	@Override
	public Optional<Notificaciones>  read(Long id) {
		// TODO Auto-generated method stub
		return notificacionesdao.read(id);
	}

	@Override
	public List<Notificaciones> readAll() {
		// TODO Auto-generated method stub
		return notificacionesdao.readAll();
	}
	

}
