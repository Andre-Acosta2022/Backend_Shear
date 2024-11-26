package com.example.demo.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.EmpresaDao;
import com.example.demo.entity.Empresa;
import com.example.demo.repository.EmpresaRepository;

@Component
public class EmpresaDaoImpl implements EmpresaDao {

	@Autowired
	private EmpresaRepository empresarepository;

	@Override
	public Empresa create(Empresa a) {
		// TODO Auto-generated method stub
		return empresarepository.save(a);
	}

	@Override
	public Empresa update(Empresa a) {
		// TODO Auto-generated method stub
		return empresarepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		empresarepository.deleteById(id);
	}

	@Override
	public Optional<Empresa> read(Long id) {
		// TODO Auto-generated method stub
		return empresarepository.findById(id);
	}

	@Override
	public List<Empresa> readAll() {
		// TODO Auto-generated method stub
		return empresarepository.findAll();
	}

}
