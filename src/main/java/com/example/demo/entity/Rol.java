package com.example.demo.entity;

import java.util.HashSet;
import java.util.List;
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
@Table(name = "rol")
public class Rol {

    @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ROL")
    @SequenceGenerator(name = "SQ_ROL", sequenceName = "SQ_ROL", allocationSize = 1)
    @Column(name = "id_rol")
    private Long idRol;

    @Column(name = "nombre")
    private String nombre;
    
    @ManyToOne
    @JoinColumn(name = "id_estado", nullable = false)
    
    private EstadoPPP estado_ppp;

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "rol")
	@JsonIgnore
	private Set<RolAcceso> rol_acceso;
    
    @OneToMany(mappedBy = "rol_emisor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<TipoDocumento> documento_emisor = new HashSet<>();
	
	@OneToMany(mappedBy = "rol_receptor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
    private Set<TipoDocumento> documento_receptor = new HashSet<>();

	@OneToMany(mappedBy = "rol")
	@JsonIgnore
	private List<UsuarioRol>usuarioRoles;

    
}
