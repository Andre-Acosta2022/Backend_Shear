package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Practica;

public interface BuscarCodigoService {
	List<Practica> buscarPorCodigoPersona(String codigo);
}
