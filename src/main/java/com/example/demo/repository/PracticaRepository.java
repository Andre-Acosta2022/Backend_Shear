package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.DetalleSolicitudDTO;
import com.example.demo.dto.SolicitudDTO;
import com.example.demo.entity.Practica;

@Repository
public interface PracticaRepository extends JpaRepository<Practica, Long> {
	
	@Query("SELECT new com.example.demo.dto.SolicitudDTO(" +
	           "p.idPractica, pe.nombre, pe.apellido, pe.codigo, e.nombre, l.nombre, pl.plan, c.nombre, s.tipo, p.fechaInicio, p.fechaFin, p.horasPlan, p.notaAcademica, p.notaEmpresarial, p.ponderadoFinal, es.estado) " +
	           "FROM Practica p " +
	           
	           "JOIN p.practicante pr " +
	           "JOIN pr.persona pe " +
	           
	           "JOIN p.empresa e " +
	           
	           "JOIN p.linea l " +
	           
				"JOIN p.plan_carrera pc " +
				"JOIN pc.plan pl " +
				
				"JOIN pc.carrera c " +
				
				"JOIN p.supervisor s " +
				
	           "JOIN p.estadoPPP es")
	    List<SolicitudDTO> findAllSolicitudes();
	
	@Query("SELECT new com.example.demo.dto.SolicitudDTO(" +
		       "p.idPractica, pe.nombre, pe.apellido, pe.codigo, e.nombre, l.nombre, pl.plan, c.nombre, s.tipo, " +
		       "p.fechaInicio, p.fechaFin, p.horasPlan, p.notaAcademica, p.notaEmpresarial, p.ponderadoFinal, es.estado) " +
		       "FROM Practica p " +
		       "JOIN p.practicante pr " +
		       "JOIN pr.persona pe " +
		       "JOIN p.empresa e " +
		       "JOIN p.linea l " +
		       "JOIN p.plan_carrera pc " +
		       "JOIN pc.plan pl " +
		       "JOIN pc.carrera c " +
		       "JOIN p.supervisor s " +
		       "JOIN p.estadoPPP es " +
		       "WHERE pe.codigo = :codigo")
		List<SolicitudDTO> findSolicitudesByCodigo(@Param("codigo") String codigo);


	
	@Query("SELECT new com.example.demo.dto.DetalleSolicitudDTO(" +
	           "e.nombre, e.ruc, e.direccion, e.correo, l.nombre, rl.nombre, rl.cargo, rl.correo, rl.telefono) " +
	           "FROM Empresa e " +
	           
	           "JOIN e.practica p " +
	           "JOIN p.linea l " +
	           
				"JOIN e.representanteLegal rl ")
	    List<DetalleSolicitudDTO> findAllDetalleSolicitudes();
	
	@Query("SELECT new com.example.demo.dto.DetalleSolicitudDTO(" +
		       "e.nombre, e.ruc, e.direccion, e.correo, l.nombre, rl.nombre, rl.cargo, rl.correo, rl.telefono) " +
		       "FROM Empresa e " +
	           
	           "JOIN e.practica p " +
	           "JOIN p.linea l " +
	           "JOIN e.representanteLegal rl "+
		       "WHERE p.idPractica = :id")
		DetalleSolicitudDTO findDetalleSolicitudById(@PathVariable("id") Long id);
	
	@Query("SELECT p FROM Practica p JOIN p.practicante pr JOIN pr.persona pe WHERE pe.codigo = :codigo")
    List<Practica> findByPersonaCodigo(@Param("codigo") String codigo);
	
	
	
}
