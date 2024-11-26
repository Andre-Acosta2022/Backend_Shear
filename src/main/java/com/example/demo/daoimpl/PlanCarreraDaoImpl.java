package com.example.demo.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.PlanCarreraDao;
import com.example.demo.entity.PlanCarrera;
import com.example.demo.repository.PlanCarreraRepository;

@Component
public class PlanCarreraDaoImpl implements PlanCarreraDao{

	@Autowired
	private PlanCarreraRepository plancarrerarepository;
	
	@Override
	public PlanCarrera create(PlanCarrera a) {
		// TODO Auto-generated method stub
		return plancarrerarepository.save(a);
	}

	@Override
	public PlanCarrera update(PlanCarrera a) {
		// TODO Auto-generated method stub
		return plancarrerarepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		plancarrerarepository.deleteById(id);
	}

	@Override
	public Optional<PlanCarrera> read(Long id) {
		// TODO Auto-generated method stub
		return plancarrerarepository.findById(id);
	}

	@Override
	public List<PlanCarrera> readAll() {
		// TODO Auto-generated method stub
		return plancarrerarepository.findAll();
	}

}
