package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import com.example.demo.dto.RegistroDTO;
import com.example.demo.entity.Empresa;
import com.example.demo.entity.EstadoPPP;
import com.example.demo.entity.RepresentanteLegal;
import com.example.demo.entity.Ubigeo;
import com.example.demo.repository.EmpresaRepository;
import com.example.demo.repository.EstadoPPPRepository;
import com.example.demo.repository.RepresentanteLegalRepository;
import com.example.demo.repository.UbigeoRepository;
import com.example.demo.service.EmpresaService;

@RestController
@RequestMapping("/api/empresa")
@CrossOrigin(origins = "http://localhost:4200")
public class EmpresaController {

	@Autowired
	private EmpresaService service;

	@GetMapping
	public ResponseEntity<List<Empresa>> readAll() {
		List<Empresa> lista = service.readAll();
		return lista.isEmpty() ? new ResponseEntity<>(null, HttpStatus.NO_CONTENT)
				: new ResponseEntity<>(lista, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Empresa> create(@Valid @RequestBody Empresa obj) {
		return new ResponseEntity<>(service.create(obj), HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Empresa> read(@PathVariable Long id) {
		return service.read(id).map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PutMapping("/{id}")
	public ResponseEntity<Empresa> update(@PathVariable Long id, @Valid @RequestBody Empresa obj) {
		return service.read(id).map(existing -> new ResponseEntity<>(service.update(obj), HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@Autowired
	private EstadoPPPRepository estadoPPPRepository;

	
	@Autowired
    private EmpresaRepository empresaRepository;

    @Autowired
    private RepresentanteLegalRepository representanteLegalRepository;

    @Autowired
    private UbigeoRepository ubigeoRepository;

    @PostMapping("/registrar")
    public ResponseEntity<String> registrarEmpresa(@RequestBody RegistroDTO dto) {
        try {
            // Buscar o crear el Ubigeo
            Ubigeo ubigeo = ubigeoRepository.findByDepartamentoAndProvinciaAndDistrito(
                    dto.getDepartamentoUbigeo(),
                    dto.getProvinciaUbigeo(),
                    dto.getDistritoUbigeo()
            );

            if (ubigeo == null) {
                ubigeo = new Ubigeo();
                ubigeo.setDepartamento(dto.getDepartamentoUbigeo());
                ubigeo.setProvincia(dto.getProvinciaUbigeo());
                ubigeo.setDistrito(dto.getDistritoUbigeo());
                ubigeo = ubigeoRepository.save(ubigeo);
            }

            // Crear RepresentanteLegal
            RepresentanteLegal representante = new RepresentanteLegal();
            representante.setNombre(dto.getNombreRepresentante());
            representante.setCargo(dto.getCargoRepresentante());
            representante.setCorreo(dto.getCorreoRepresentante());
            representante.setTelefono(dto.getTelefonoRepresentante());
            representante = representanteLegalRepository.save(representante);

            // Asignar el estado predeterminado con id_estado = 6 ("En Proceso")
            EstadoPPP estadoEnProceso = estadoPPPRepository.findById(6L).orElseThrow(() -> 
                    new RuntimeException("Error: No se encontró el estado con id 6 (En Proceso)"));

            // Crear Empresa
            Empresa empresa = new Empresa();
            empresa.setNombre(dto.getNombreEmpresa());
            empresa.setRuc(dto.getRucEmpresa());
            empresa.setTelefono(dto.getTelefonoEmpresa());
            empresa.setCorreo(dto.getCorreoEmpresa());
            empresa.setDireccion(dto.getDireccionEmpresa());
            empresa.setUbigeo(ubigeo);
            empresa.setRepresentanteLegal(representante);
            empresa.setEstado_ppp(estadoEnProceso); // Asignar el estado "En Proceso"

            empresaRepository.save(empresa);

            return ResponseEntity.ok("Empresa registrada exitosamente con estado 'En Proceso'");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al registrar la empresa: " + e.getMessage());
        }
    }


}