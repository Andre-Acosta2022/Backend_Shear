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
@Table(name = "acceso")
public class Acceso {
	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ACCESO")
    @SequenceGenerator(name = "SQ_ACCESO", sequenceName = "SQ_ACCESO", allocationSize = 1)
	@Column(name = "id_acceso")
	private Long idAcceso; // Usamos camelCase en el nombre de la variable

	@Column(name = "acceso")
	private String acceso;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "acceso")
	@JsonIgnore // Controla la serialización para evitar ciclos
	private Set<RolAcceso> rol_acceso;
}
