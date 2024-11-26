package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Practica;
import com.example.demo.repository.PracticaRepository;
import com.example.demo.service.BuscarCodigoService;

@Service
public class BuscarCodigoServiceImpl implements BuscarCodigoService {
	
	@Autowired
    private PracticaRepository practicaRepository;

	@Override
	public List<Practica> buscarPorCodigoPersona(String codigo) {
        return practicaRepository.findByPersonaCodigo(codigo);
    }
}
