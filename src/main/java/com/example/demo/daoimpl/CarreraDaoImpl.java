package com.example.demo.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.CarreraDao;
import com.example.demo.entity.Carrera;
import com.example.demo.repository.CarreraRepository;

@Component
public class CarreraDaoImpl implements CarreraDao{

	@Autowired
	private CarreraRepository carrerarepository;
	
	@Override
	public Carrera create(Carrera a) {
		// TODO Auto-generated method stub
		return carrerarepository.save(a);
	}

	@Override
	public Carrera update(Carrera a) {
		// TODO Auto-generated method stub
		return carrerarepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		carrerarepository.deleteById(id);
	}

	@Override
	public Optional<Carrera> read(Long id) {
		// TODO Auto-generated method stub
		return carrerarepository.findById(id);
	}

	@Override
	public List<Carrera> readAll() {
		// TODO Auto-generated method stub
		return carrerarepository.findAll();
	}

}