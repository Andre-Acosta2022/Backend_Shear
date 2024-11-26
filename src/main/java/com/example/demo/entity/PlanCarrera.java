package com.example.demo.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "plan_carrera")
public class PlanCarrera {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PLAN_CARRERA")
    @SequenceGenerator(name = "SQ_PLAN_CARRERA", sequenceName = "SQ_PLAN_CARRERA", allocationSize = 1)
	@Column(name = "id_plan_carrera")
	private Long idPlanCarrera;

	@Column(name = "horas")
	private Integer horas;

	@ManyToOne
	@JoinColumn(name = "id_plan", nullable = false)
	private Plan plan;

	@ManyToOne
	@JoinColumn(name = "id_carrera", nullable = false)
	private Carrera carrera;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "plan_carrera")
	@JsonIgnore
	private Set<Practicante> practicante;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "plan_carrera")
	@JsonIgnore
	private Set<Practica> practica;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JsonIgnore
	@JoinTable(name = "documentos_plan", joinColumns = @JoinColumn(name = "id_plan_carrera", referencedColumnName = "id_plan_carrera"), inverseJoinColumns = @JoinColumn(name = "id_tipo_documento", referencedColumnName = "id_tipo_documento"))
	private Set<TipoDocumento> tipo_documento;

}
