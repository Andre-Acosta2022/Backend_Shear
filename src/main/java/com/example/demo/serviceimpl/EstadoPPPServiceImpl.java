package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EstadoPPPDao;
import com.example.demo.entity.EstadoPPP;
import com.example.demo.service.EstadoPPPService;

@Service
public class EstadoPPPServiceImpl implements EstadoPPPService {

	@Autowired
	private EstadoPPPDao EstadoPPPdao;
	
	@Override
	public EstadoPPP create(EstadoPPP a) {
		// TODO Auto-generated method stub
		return EstadoPPPdao.create(a);
	}

	@Override
	public EstadoPPP update(EstadoPPP a) {
		// TODO Auto-generated method stub
		return EstadoPPPdao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		EstadoPPPdao.delete(id);
	}

	@Override
	public Optional<EstadoPPP>  read(Long id) {
		// TODO Auto-generated method stub
		return EstadoPPPdao.read(id);
	}

	@Override
	public List<EstadoPPP> readAll() {
		// TODO Auto-generated method stub
		return EstadoPPPdao.readAll();
	}
	

}