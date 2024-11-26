package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import com.example.demo.entity.Supervisor;
import com.example.demo.service.SupervisorService;

@RestController
@RequestMapping("/api/supervisor")
@CrossOrigin(origins = "http://localhost:4200")
public class SupervisorController {

	@Autowired
	private SupervisorService service;

	@GetMapping
	public ResponseEntity<List<Supervisor>> readAll() {
		List<Supervisor> lista = service.readAll();
		return lista.isEmpty() ? new ResponseEntity<>(null, HttpStatus.NO_CONTENT)
				: new ResponseEntity<>(lista, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Supervisor> create(@Valid @RequestBody Supervisor obj) {
		return new ResponseEntity<>(service.create(obj), HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Supervisor> read(@PathVariable Long id) {
		return service.read(id).map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PutMapping("/{id}")
	public ResponseEntity<Supervisor> update(@PathVariable Long id, @Valid @RequestBody Supervisor obj) {
		return service.read(id).map(existing -> new ResponseEntity<>(service.update(obj), HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}