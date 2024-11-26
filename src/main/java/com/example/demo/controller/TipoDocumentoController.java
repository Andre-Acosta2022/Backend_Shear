package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import com.example.demo.entity.TipoDocumento;
import com.example.demo.service.TipoDocumentoService;

@RestController
@RequestMapping("/api/tipo_documento")
@CrossOrigin(origins = "http://localhost:4200")
public class TipoDocumentoController {

	@Autowired
	private TipoDocumentoService service;

	@GetMapping
	public ResponseEntity<List<TipoDocumento>> readAll() {
		List<TipoDocumento> lista = service.readAll();
		return lista.isEmpty() ? new ResponseEntity<>(null, HttpStatus.NO_CONTENT)
				: new ResponseEntity<>(lista, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<TipoDocumento> create(@Valid @RequestBody TipoDocumento obj) {
		return new ResponseEntity<>(service.create(obj), HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<TipoDocumento> read(@PathVariable Long id) {
		return service.read(id).map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PutMapping("/{id}")
	public ResponseEntity<TipoDocumento> update(@PathVariable Long id, @Valid @RequestBody TipoDocumento obj) {
		return service.read(id).map(existing -> new ResponseEntity<>(service.update(obj), HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}