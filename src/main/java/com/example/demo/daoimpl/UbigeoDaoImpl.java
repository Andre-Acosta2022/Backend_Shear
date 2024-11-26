package com.example.demo.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.UbigeoDao;
import com.example.demo.entity.Ubigeo;
import com.example.demo.repository.UbigeoRepository;

@Component
public class UbigeoDaoImpl implements UbigeoDao {

	@Autowired
	private UbigeoRepository ubigeorepository;

	@Override
	public Ubigeo create(Ubigeo a) {
		// TODO Auto-generated method stub
		return ubigeorepository.save(a);
	}

	@Override
	public Ubigeo update(Ubigeo a) {
		// TODO Auto-generated method stub
		return ubigeorepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ubigeorepository.deleteById(id);
	}

	@Override
	public Optional<Ubigeo> read(Long id) {
		// TODO Auto-generated method stub
		return ubigeorepository.findById(id);
	}

	@Override
	public List<Ubigeo> readAll() {
		// TODO Auto-generated method stub
		return ubigeorepository.findAll();
	}

}
