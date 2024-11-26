package com.example.demo.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.PracticaDao;
import com.example.demo.entity.Practica;
import com.example.demo.repository.PracticaRepository;

@Component

public class PracticaDaoImpl implements PracticaDao {
	@Autowired
	private PracticaRepository practicarepository;

	@Override
	public Practica create(Practica a) {
		// TODO Auto-generated method stub
		return practicarepository.save(a);
	}

	@Override
	public Practica update(Practica a) {
		// TODO Auto-generated method stub
		return practicarepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		practicarepository.deleteById(id);
	}

	@Override
	public Optional<Practica> read(Long id) {
		// TODO Auto-generated method stub
		return practicarepository.findById(id);
	}

	@Override
	public List<Practica> readAll() {
		// TODO Auto-generated method stub
		return practicarepository.findAll();
	}

}
