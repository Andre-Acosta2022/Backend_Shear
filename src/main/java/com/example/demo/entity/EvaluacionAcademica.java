package com.example.demo.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "evaluacion_academica")
public class EvaluacionAcademica {

	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_EvaluacionAcademica")
    @SequenceGenerator(name = "SQ_EvaluacionAcademica", sequenceName = "SQ_EvaluacionAcademica", allocationSize = 1)
	@Column(name = "id_evaluacion_academica")
	private Long idEvaluacionAcademica;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fecha_evaluacion", nullable = false)
	private LocalDate fechaEvaluacion;

	@Column(name = "calificacion", nullable = false)
	private Double calificacion;

	@Column(name = "observaciones")
	private String observaciones;

	@ManyToOne
	@JoinColumn(name = "id_practica", nullable = false)

	private Practica practica;
}
