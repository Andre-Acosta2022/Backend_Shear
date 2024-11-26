package com.example.demo.entity;

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
@Table(name = "rol_acceso")
public class RolAcceso {

	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ROLACCESO")
    @SequenceGenerator(name = "SQ_ROLACCESO", sequenceName = "SQ_ROLACCESO", allocationSize = 1)
	@Column(name = "id_rol_acceso")
	private Long idRolAcceso;

	@ManyToOne
	@JoinColumn(name = "id_acceso", nullable = false)
	private Acceso acceso;

	@ManyToOne
	@JoinColumn(name = "id_rol", nullable = false)
	private Rol rol;

}
