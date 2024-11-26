package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DetalleSolicitudDTO;
import com.example.demo.repository.PracticaRepository;

@RestController
@RequestMapping("/api/detalle")
@CrossOrigin(origins = "http://localhost:4200")
public class DetalleSolicitudController {

	 private final PracticaRepository practicaRepository;

	    public DetalleSolicitudController(PracticaRepository practicaRepository) {
	        this.practicaRepository = practicaRepository;
	    }

	    @GetMapping
	    public ResponseEntity<List<DetalleSolicitudDTO>> getDetalleSolicitudes() {
	        List<DetalleSolicitudDTO> detallesolicitudes = practicaRepository.findAllDetalleSolicitudes();
	        return detallesolicitudes.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(detallesolicitudes);
	    }
	    
	    
	    @GetMapping("/{id}")
	    public ResponseEntity<DetalleSolicitudDTO> getDetalleSolicitudById(@PathVariable Long id) {
	        DetalleSolicitudDTO detalle = practicaRepository.findDetalleSolicitudById(id);

	        if (detalle == null) {
	            return ResponseEntity.notFound().build();
	        }
	        return ResponseEntity.ok(detalle);
	    }


	
}
