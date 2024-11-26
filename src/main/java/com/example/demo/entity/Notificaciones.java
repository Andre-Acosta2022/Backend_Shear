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
@Table(name = "notificaciones")
public class Notificaciones {

	@Id
 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_NOTIFICACIONES")
    @SequenceGenerator(name = "SQ_NOTIFICACIONES", sequenceName = "SQ_NOTIFICACIONES", allocationSize = 1)
	@Column(name = "id_notificacion")
	private Long idNotificacion;

	@Column(name = "titulo", nullable = false)
	private String titulo;

	@ManyToOne
	@JoinColumn(name = "id_usuario_recibe", referencedColumnName = "id_usuario", nullable = false)
	private Usuario usuario_recibe;

	@ManyToOne
	@JoinColumn(name = "id_usuario_envia", referencedColumnName = "id_usuario", nullable = false)
	private Usuario usuario_envia;

	@ManyToOne
	@JoinColumn(name = "id_mensaje", nullable = false)
	private Mensaje mensaje;

	@ManyToOne
	@JoinColumn(name = "id_documentacion", nullable = false)
	private Documentacion documentacion;
}
