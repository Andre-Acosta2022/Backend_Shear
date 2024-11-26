package com.example.demo.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.SupervisorDao;
import com.example.demo.entity.Supervisor;
import com.example.demo.repository.SupervisorRepository;

@Component
public class SupervisorDaoImpl implements SupervisorDao {

	@Autowired
	private SupervisorRepository supervisorrepository;

	@Override
	public Supervisor create(Supervisor a) {
		// TODO Auto-generated method stub
		return supervisorrepository.save(a);
	}

	@Override
	public Supervisor update(Supervisor a) {
		// TODO Auto-generated method stub
		return supervisorrepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		supervisorrepository.deleteById(id);
	}

	@Override
	public Optional<Supervisor> read(Long id) {
		// TODO Auto-generated method stub
		return supervisorrepository.findById(id);
	}

	@Override
	public List<Supervisor> readAll() {
		// TODO Auto-generated method stub
		return supervisorrepository.findAll();
	}

}
