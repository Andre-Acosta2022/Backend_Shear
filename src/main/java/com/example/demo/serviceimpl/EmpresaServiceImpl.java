package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmpresaDao;
import com.example.demo.entity.Empresa;
import com.example.demo.service.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService {

	@Autowired
	private EmpresaDao empresadao;
	
	@Override
	public Empresa create(Empresa a) {
		// TODO Auto-generated method stub
		return empresadao.create(a);
	}

	@Override
	public Empresa update(Empresa a) {
		// TODO Auto-generated method stub
		return empresadao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		empresadao.delete(id);
	}

	@Override
	public Optional<Empresa>  read(Long id) {
		// TODO Auto-generated method stub
		return empresadao.read(id);
	}

	@Override
	public List<Empresa> readAll() {
		// TODO Auto-generated method stub
		return empresadao.readAll();
	}
	

}
