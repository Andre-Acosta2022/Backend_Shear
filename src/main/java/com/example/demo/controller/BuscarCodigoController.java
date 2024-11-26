package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Practica;
import com.example.demo.service.BuscarCodigoService;

@RestController
@RequestMapping("/api/buscar")
@CrossOrigin(origins = "http://localhost:4200")
public class BuscarCodigoController {

	@Autowired
    private BuscarCodigoService buscarcodigoService;
	// Endpoint para buscar una práctica por el código del practicante
	@GetMapping("/buscar/{codigo}")
    public ResponseEntity<List<Practica>> buscarPracticasPorCodigo(@PathVariable String codigo) {
        List<Practica> practicas = buscarcodigoService.buscarPorCodigoPersona(codigo);
        if (!practicas.isEmpty()) {
            return ResponseEntity.ok(practicas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
