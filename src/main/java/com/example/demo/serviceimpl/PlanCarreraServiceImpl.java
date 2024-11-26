package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PlanCarreraDao;
import com.example.demo.entity.PlanCarrera;
import com.example.demo.service.PlanCarreraService;

@Service
public class PlanCarreraServiceImpl implements PlanCarreraService {

	@Autowired
	private PlanCarreraDao plancarreradao;

	@Override
	public PlanCarrera create(PlanCarrera a) {
		// TODO Auto-generated method stub
		return plancarreradao.create(a);
	}

	@Override
	public PlanCarrera update(PlanCarrera a) {
		// TODO Auto-generated method stub
		return plancarreradao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		plancarreradao.delete(id);
	}

	@Override
	public Optional<PlanCarrera> read(Long id) {
		// TODO Auto-generated method stub
		return plancarreradao.read(id);
	}

	@Override
	public List<PlanCarrera> readAll() {
		// TODO Auto-generated method stub
		return plancarreradao.readAll();
	}

}
