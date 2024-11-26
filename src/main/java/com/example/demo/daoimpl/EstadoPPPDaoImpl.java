package com.example.demo.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.EstadoPPPDao;
import com.example.demo.entity.EstadoPPP;
import com.example.demo.repository.EstadoPPPRepository;

@Component
public class EstadoPPPDaoImpl implements EstadoPPPDao{

	@Autowired
	private EstadoPPPRepository EstadoPPPrepository;
	
	@Override
	public EstadoPPP create(EstadoPPP a) {
		// TODO Auto-generated method stub
		return EstadoPPPrepository.save(a);
	}

	@Override
	public EstadoPPP update(EstadoPPP a) {
		// TODO Auto-generated method stub
		return EstadoPPPrepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		EstadoPPPrepository.deleteById(id);
	}

	@Override
	public Optional<EstadoPPP> read(Long id) {
		// TODO Auto-generated method stub
		return EstadoPPPrepository.findById(id);
	}

	@Override
	public List<EstadoPPP> readAll() {
		// TODO Auto-generated method stub
		return EstadoPPPrepository.findAll();
	}

}