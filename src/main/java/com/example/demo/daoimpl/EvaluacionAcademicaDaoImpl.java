package com.example.demo.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.EvaluacionAcademicaDao;
import com.example.demo.entity.EvaluacionAcademica;
import com.example.demo.repository.EvaluacionAcademicaRepository;

@Component
public class EvaluacionAcademicaDaoImpl implements EvaluacionAcademicaDao {

	@Autowired
	private EvaluacionAcademicaRepository evaluacionacademicarepository;

	@Override
	public EvaluacionAcademica create(EvaluacionAcademica a) {
		// TODO Auto-generated method stub
		return evaluacionacademicarepository.save(a);
	}

	@Override
	public EvaluacionAcademica update(EvaluacionAcademica a) {
		// TODO Auto-generated method stub
		return evaluacionacademicarepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		evaluacionacademicarepository.deleteById(id);
	}

	@Override
	public Optional<EvaluacionAcademica> read(Long id) {
		// TODO Auto-generated method stub
		return evaluacionacademicarepository.findById(id);
	}

	@Override
	public List<EvaluacionAcademica> readAll() {
		// TODO Auto-generated method stub
		return evaluacionacademicarepository.findAll();
	}

}
