package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PlanDao;
import com.example.demo.entity.Plan;
import com.example.demo.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	private PlanDao plandao;
	
	@Override
	public Plan create(Plan a) {
		// TODO Auto-generated method stub
		return plandao.create(a);
	}

	@Override
	public Plan update(Plan a) {
		// TODO Auto-generated method stub
		return plandao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		plandao.delete(id);
	}

	@Override
	public Optional<Plan> read(Long id) {
		// TODO Auto-generated method stub
		return plandao.read(id);
	}

	@Override
	public List<Plan> readAll() {
		// TODO Auto-generated method stub
		return plandao.readAll();
	}
	

}