package com.example.demo.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.PlanDao;
import com.example.demo.entity.Plan;
import com.example.demo.repository.PlanRepository;

@Component
public class PlanDaoImpl implements PlanDao {

	@Autowired
	private PlanRepository planrepository;

	@Override
	public Plan create(Plan a) {
		// TODO Auto-generated method stub
		return planrepository.save(a);
	}

	@Override
	public Plan update(Plan a) {
		// TODO Auto-generated method stub
		return planrepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		planrepository.deleteById(id);
	}

	@Override
	public Optional<Plan> read(Long id) {
		// TODO Auto-generated method stub
		return planrepository.findById(id);
	}

	@Override
	public List<Plan> readAll() {
		// TODO Auto-generated method stub
		return planrepository.findAll();
	}

}
