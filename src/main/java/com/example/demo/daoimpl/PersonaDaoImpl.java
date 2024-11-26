package com.example.demo.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.PersonaDao;
import com.example.demo.entity.Persona;
import com.example.demo.repository.PersonaRepository;

@Component
public class PersonaDaoImpl implements PersonaDao {

	@Autowired
	private PersonaRepository personarepository;

	@Override
	public Persona create(Persona a) {
		// TODO Auto-generated method stub
		return personarepository.save(a);
	}

	@Override
	public Persona update(Persona a) {
		// TODO Auto-generated method stub
		return personarepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		personarepository.deleteById(id);
	}

	@Override
	public Optional<Persona> read(Long id) {
		// TODO Auto-generated method stub
		return personarepository.findById(id);
	}

	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return personarepository.findAll();
	}

}
