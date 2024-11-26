package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.RolAccesoDao;
import com.example.demo.entity.RolAcceso;
import com.example.demo.service.RolAccesoService;

@Service
public class RolAccesoServiceImpl implements RolAccesoService {

	@Autowired
	private RolAccesoDao rolaccesodao;
	
	@Override
	public RolAcceso create(RolAcceso a) {
		// TODO Auto-generated method stub
		return rolaccesodao.create(a);
	}

	@Override
	public RolAcceso update(RolAcceso a) {
		// TODO Auto-generated method stub
		return rolaccesodao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rolaccesodao.delete(id);
	}

	@Override
	public Optional<RolAcceso> read(Long id) {
		// TODO Auto-generated method stub
		return rolaccesodao.read(id);
	}

	@Override
	public List<RolAcceso> readAll() {
		// TODO Auto-generated method stub
		return rolaccesodao.readAll();
	}
	

}
