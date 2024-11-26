package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import com.example.demo.entity.Practica;
import com.example.demo.service.PracticaService;

@RestController
@RequestMapping("/api/practica")
@CrossOrigin(origins = "http://localhost:4200")
public class PracticaController {

	@Autowired
    private PracticaService service; 
    
    @GetMapping
    public ResponseEntity<List<Practica>> readAll() {
        List<Practica> lista = service.readAll();
        return lista.isEmpty() ? new ResponseEntity<>(null, HttpStatus.NO_CONTENT) : new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Practica> create(@Valid @RequestBody Practica obj) {
        return new ResponseEntity<>(service.create(obj), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Practica> read(@PathVariable Long id) {
        return service.read(id).map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Practica> update(@PathVariable Long id, @Valid @RequestBody Practica obj) {
        return service.read(id).map(existing -> new ResponseEntity<>(service.update(obj), HttpStatus.OK))
                               .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
