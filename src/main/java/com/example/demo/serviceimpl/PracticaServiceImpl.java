package com.example.demo.serviceimpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PracticaDao;
import com.example.demo.entity.Practica;
import com.example.demo.service.PracticaService;

@Service
public class PracticaServiceImpl  implements PracticaService {
	
	@Autowired
	private PracticaDao practicadao;
	
	
	@Override
	public Practica create(Practica a) {
		// TODO Auto-generated method stub
		return practicadao.create(a);
	}

	@Override
	public Practica update(Practica a) {
		// TODO Auto-generated method stub
		return practicadao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		practicadao.delete(id);
	}

	@Override
	public Optional<Practica> read(Long id) {
		// TODO Auto-generated method stub
		return practicadao.read(id);
	}

	@Override
	public List<Practica> readAll() {
		// TODO Auto-generated method stub
		return practicadao.readAll();
	}
}
