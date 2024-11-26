package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import com.example.demo.entity.Ubigeo;
import com.example.demo.service.UbigeoService;

@RestController
@RequestMapping("/api/ubigeo")
@CrossOrigin(origins = "http://localhost:4200")
public class UbigeoController {

	@Autowired
	private UbigeoService service;

	@GetMapping
	public ResponseEntity<List<Ubigeo>> readAll() {
		List<Ubigeo> lista = service.readAll();
		return lista.isEmpty() ? new ResponseEntity<>(null, HttpStatus.NO_CONTENT)
				: new ResponseEntity<>(lista, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Ubigeo> create(@Valid @RequestBody Ubigeo obj) {
		return new ResponseEntity<>(service.create(obj), HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Ubigeo> read(@PathVariable Long id) {
		return service.read(id).map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PutMapping("/{id}")
	public ResponseEntity<Ubigeo> update(@PathVariable Long id, @Valid @RequestBody Ubigeo obj) {
		return service.read(id).map(existing -> new ResponseEntity<>(service.update(obj), HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}