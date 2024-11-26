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
@Table(name = "documentacion")
public class Documentacion {
	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DOCUMENTACION")
    @SequenceGenerator(name = "SQ_DOCUMENTACION", sequenceName = "SQ_DOCUMENTACION", allocationSize = 1)
	@Column(name = "id_documentacion")
	private Long idDocumentacion;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "url")
	private String url;

	@Column(name = "fecha_creacion")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaCreacion;

	@Column(name = "fecha_subida")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaSubida;

	@ManyToOne
	@JoinColumn(name = "id_estado", nullable = false)

	private EstadoPPP estado_ppp;

	@ManyToOne
	@JoinColumn(name = "id_practica", nullable = false)

	private Practica practica;

	@ManyToOne
	@JoinColumn(name = "id_tipo_documento", nullable = false)

	private TipoDocumento tipo_documento;
}
