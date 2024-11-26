package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LineaDao;
import com.example.demo.entity.Linea;
import com.example.demo.service.LineaService;

@Service
public class LineaServiceImpl implements LineaService {

	@Autowired
	private LineaDao lineadao;
	
	@Override
	public Linea create(Linea a) {
		// TODO Auto-generated method stub
		return lineadao.create(a);
	}

	@Override
	public Linea update(Linea a) {
		// TODO Auto-generated method stub
		return lineadao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		lineadao.delete(id);
	}

	@Override
	public Optional<Linea> read(Long id) {
		// TODO Auto-generated method stub
		return lineadao.read(id);
	}

	@Override
	public List<Linea> readAll() {
		// TODO Auto-generated method stub
		return lineadao.readAll();
	}
	

}
