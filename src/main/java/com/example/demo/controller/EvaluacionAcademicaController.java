package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import com.example.demo.entity.EvaluacionAcademica;
import com.example.demo.service.EvaluacionAcademicaService;

@RestController
@RequestMapping("/api/evaluacion_academica")
@CrossOrigin(origins = "http://localhost:4200")
public class EvaluacionAcademicaController {

	@Autowired
	private EvaluacionAcademicaService service;

	@GetMapping
	public ResponseEntity<List<EvaluacionAcademica>> readAll() {
		List<EvaluacionAcademica> lista = service.readAll();
		return lista.isEmpty() ? new ResponseEntity<>(null, HttpStatus.NO_CONTENT)
				: new ResponseEntity<>(lista, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<EvaluacionAcademica> create(@Valid @RequestBody EvaluacionAcademica obj) {
		return new ResponseEntity<>(service.create(obj), HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<EvaluacionAcademica> read(@PathVariable Long id) {
		return service.read(id).map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PutMapping("/{id}")
	public ResponseEntity<EvaluacionAcademica> update(@PathVariable Long id,
			@Valid @RequestBody EvaluacionAcademica obj) {
		return service.read(id).map(existing -> new ResponseEntity<>(service.update(obj), HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}