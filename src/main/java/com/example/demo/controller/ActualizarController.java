package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ActualizarService;

@RestController
@RequestMapping("/api/practicas")
@CrossOrigin(origins = "http://localhost:4200")
public class ActualizarController {
	
	@Autowired
    private ActualizarService actualizarService;
	
	@PutMapping("/{id}/estado")
	public ResponseEntity<Map<String, String>> actualizarEstado(
	        @PathVariable("id") Long idPractica,
	        @RequestBody Map<String, Long> request) {
	    try {
	        Long idEstadoPPP = request.get("idEstadoPPP");
	        actualizarService.actualizarEstado(idPractica, idEstadoPPP);

	        // Crear un JSON como respuesta
	        Map<String, String> response = new HashMap<>();
	        response.put("message", "Estado actualizado correctamente");

	        return ResponseEntity.ok(response);
	    } catch (Exception e) {
	        Map<String, String> errorResponse = new HashMap<>();
	        errorResponse.put("error", "Error al actualizar el estado: " + e.getMessage());
	        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
	    }
	}
}

