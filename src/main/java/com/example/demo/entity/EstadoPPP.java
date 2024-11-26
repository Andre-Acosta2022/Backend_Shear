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
@Table(name = "estado_ppp")
public class EstadoPPP {

	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ESTADOPPP")
    @SequenceGenerator(name = "SQ_ESTADOPPP", sequenceName = "SQ_ESTADOPPP", allocationSize = 1)
	@Column(name = "id_estado")
	private Long idEstado;

	@Column(name = "estado")
	private String estado;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "estado_ppp")
	@JsonIgnore
	private Set<Empresa> empresa;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "estadoPPP")
	@JsonIgnore
	private Set<Practica> practica;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "estado_ppp")
	@JsonIgnore
	private Set<Linea> linea;

	/*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "estado_ppp")
	@JsonIgnore
	private Set<RepresentanteLegal> representante_legal;*/

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "estado_ppp")
	@JsonIgnore
	private Set<Practicante> practicante;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "estado_ppp")
	@JsonIgnore
	private Set<Carrera> carrera;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "estado_ppp")
	@JsonIgnore
	private Set<Documentacion> documentacion;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "estado_ppp")
	@JsonIgnore
	private Set<Persona> persona;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "estado_ppp")
	@JsonIgnore
	private Set<Plan> plan;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "estado_ppp")
	@JsonIgnore
	private Set<Rol> rol;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "estado_ppp")
	@JsonIgnore
	private Set<Usuario> usuario;
}
