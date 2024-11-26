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
@Table(name = "empresa")
public class Empresa {
	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_EMPRESA")
    @SequenceGenerator(name = "SQ_EMPRESA", sequenceName = "SQ_EMPRESA", allocationSize = 1)
	@Column(name = "id_empresa")
	private Long idEmpresa;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "ruc", nullable = false)
	private String ruc;

	@Column(name = "correo", nullable = false)
	private String correo;

	@Column(name = "telefono", nullable = false)
	private String telefono;

	@Column(name = "direccion", nullable = false)
	private String direccion;

	@ManyToOne
	@JoinColumn(name = "id_representante", nullable = false)
	private RepresentanteLegal representanteLegal;

	@ManyToOne
	@JoinColumn(name = "id_estado", nullable = false)

	private EstadoPPP estado_ppp;

	@ManyToOne
	@JoinColumn(name = "id_ubigeo", nullable = false)
	private Ubigeo ubigeo;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "empresa")
	@JsonIgnore
	private Set<Practica> practica;
}
