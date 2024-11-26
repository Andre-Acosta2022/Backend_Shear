package com.example.demo.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.PracticanteDao;
import com.example.demo.entity.Practicante;
import com.example.demo.repository.PracticanteRepository;

@Component
public class PracticanteDaoImpl implements PracticanteDao {

	@Autowired
	private PracticanteRepository practicanterepository;

	@Override
	public Practicante create(Practicante a) {
		// TODO Auto-generated method stub
		return practicanterepository.save(a);
	}

	@Override
	public Practicante update(Practicante a) {
		// TODO Auto-generated method stub
		return practicanterepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		practicanterepository.deleteById(id);
	}

	@Override
	public Optional<Practicante> read(Long id) {
		// TODO Auto-generated method stub
		return practicanterepository.findById(id);
	}

	@Override
	public List<Practicante> readAll() {
		// TODO Auto-generated method stub
		return practicanterepository.findAll();
	}

}
