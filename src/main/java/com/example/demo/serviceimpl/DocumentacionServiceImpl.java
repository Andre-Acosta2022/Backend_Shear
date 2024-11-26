package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DocumentacionDao;
import com.example.demo.entity.Documentacion;
import com.example.demo.service.DocumentacionService;

@Service
public class DocumentacionServiceImpl implements DocumentacionService {

	@Autowired
	private DocumentacionDao documentaciondao;
	
	@Override
	public Documentacion create(Documentacion a) {
		// TODO Auto-generated method stub
		return documentaciondao.create(a);
	}

	@Override
	public Documentacion update(Documentacion a) {
		// TODO Auto-generated method stub
		return documentaciondao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		documentaciondao.delete(id);
	}

	@Override
	public Optional<Documentacion>  read(Long id) {
		// TODO Auto-generated method stub
		return documentaciondao.read(id);
	}

	@Override
	public List<Documentacion> readAll() {
		// TODO Auto-generated method stub
		return documentaciondao.readAll();
	}
	

}

