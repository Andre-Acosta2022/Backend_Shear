package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EvaluacionAcademicaDao;
import com.example.demo.entity.EvaluacionAcademica;
import com.example.demo.service.EvaluacionAcademicaService;

@Service
public class EvaluacionAcademicaServiceImpl implements EvaluacionAcademicaService {

	@Autowired
	private EvaluacionAcademicaDao evaluacionacademicadao;
	
	@Override
	public EvaluacionAcademica create(EvaluacionAcademica a) {
		// TODO Auto-generated method stub
		return evaluacionacademicadao.create(a);
	}

	@Override
	public EvaluacionAcademica update(EvaluacionAcademica a) {
		// TODO Auto-generated method stub
		return evaluacionacademicadao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		evaluacionacademicadao.delete(id);
	}

	@Override
	public Optional<EvaluacionAcademica>  read(Long id) {
		// TODO Auto-generated method stub
		return evaluacionacademicadao.read(id);
	}

	@Override
	public List<EvaluacionAcademica> readAll() {
		// TODO Auto-generated method stub
		return evaluacionacademicadao.readAll();
	}
	

}
