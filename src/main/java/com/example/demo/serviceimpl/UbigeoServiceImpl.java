package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UbigeoDao;
import com.example.demo.entity.Ubigeo;
import com.example.demo.service.UbigeoService;

@Service
public class UbigeoServiceImpl implements UbigeoService {

	@Autowired
	private UbigeoDao ubigeodao;
	
	@Override
	public Ubigeo create(Ubigeo a) {
		// TODO Auto-generated method stub
		return ubigeodao.create(a);
	}

	@Override
	public Ubigeo update(Ubigeo a) {
		// TODO Auto-generated method stub
		return ubigeodao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ubigeodao.delete(id);
	}

	@Override
	public Optional<Ubigeo> read(Long id) {
		// TODO Auto-generated method stub
		return ubigeodao.read(id);
	}

	@Override
	public List<Ubigeo> readAll() {
		// TODO Auto-generated method stub
		return ubigeodao.readAll();
	}
	

}
