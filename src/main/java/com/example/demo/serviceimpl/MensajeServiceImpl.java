package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MensajeDao;
import com.example.demo.entity.Mensaje;
import com.example.demo.service.MensajeService;

@Service
public class MensajeServiceImpl implements MensajeService {

	@Autowired
	private MensajeDao mensajedao;
	
	@Override
	public Mensaje create(Mensaje a) {
		// TODO Auto-generated method stub
		return mensajedao.create(a);
	}

	@Override
	public Mensaje update(Mensaje a) {
		// TODO Auto-generated method stub
		return mensajedao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		mensajedao.delete(id);
	}

	@Override
	public Optional<Mensaje>  read(Long id) {
		// TODO Auto-generated method stub
		return mensajedao.read(id);
	}

	@Override
	public List<Mensaje> readAll() {
		// TODO Auto-generated method stub
		return mensajedao.readAll();
	}
	

}
