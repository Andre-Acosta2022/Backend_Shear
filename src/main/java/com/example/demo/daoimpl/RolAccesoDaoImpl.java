package com.example.demo.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.RolAccesoDao;
import com.example.demo.entity.RolAcceso;
import com.example.demo.repository.RolAccesoRepository;

@Component
public class RolAccesoDaoImpl implements RolAccesoDao {

	@Autowired
	private RolAccesoRepository rolAccesorepository;

	@Override
	public RolAcceso create(RolAcceso a) {
		// TODO Auto-generated method stub
		return rolAccesorepository.save(a);
	}

	@Override
	public RolAcceso update(RolAcceso a) {
		// TODO Auto-generated method stub
		return rolAccesorepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rolAccesorepository.deleteById(id);
	}

	@Override
	public Optional<RolAcceso> read(Long id) {
		// TODO Auto-generated method stub
		return rolAccesorepository.findById(id);
	}

	@Override
	public List<RolAcceso> readAll() {
		// TODO Auto-generated method stub
		return rolAccesorepository.findAll();
	}

}
