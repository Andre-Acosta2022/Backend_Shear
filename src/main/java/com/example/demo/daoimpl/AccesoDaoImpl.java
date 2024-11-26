package com.example.demo.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.AccesoDao;
import com.example.demo.entity.Acceso;
import com.example.demo.repository.AccesoRepository;

@Component
public class AccesoDaoImpl implements AccesoDao {

	@Autowired
	private AccesoRepository accesorepository;

	@Override
	public Acceso create(Acceso a) {
		// TODO Auto-generated method stub
		return accesorepository.save(a);
	}

	@Override
	public Acceso update(Acceso a) {
		// TODO Auto-generated method stub
		return accesorepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		accesorepository.deleteById(id);
	}

	@Override
	public Optional<Acceso> read(Long id) {
		// TODO Auto-generated method stub
		return accesorepository.findById(id);
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return accesorepository.findAll();
	}

}
