package com.example.demo.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.DocumentacionDao;
import com.example.demo.entity.Documentacion;
import com.example.demo.repository.DocumentacionRepository;

@Component
public class DocumentacionDaoImpl implements DocumentacionDao {

	@Autowired
	private DocumentacionRepository documentacionrepository;

	@Override
	public Documentacion create(Documentacion a) {
		// TODO Auto-generated method stub
		return documentacionrepository.save(a);
	}

	@Override
	public Documentacion update(Documentacion a) {
		// TODO Auto-generated method stub
		return documentacionrepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		documentacionrepository.deleteById(id);
	}

	@Override
	public Optional<Documentacion> read(Long id) {
		// TODO Auto-generated method stub
		return documentacionrepository.findById(id);
	}

	@Override
	public List<Documentacion> readAll() {
		// TODO Auto-generated method stub
		return documentacionrepository.findAll();
	}

}
