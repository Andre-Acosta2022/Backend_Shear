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
@Table(name = "representante_legal")
public class RepresentanteLegal {

    @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_REPRESENTANTE_LEGAL")
    @SequenceGenerator(name = "SQ_REPRESENTANTE_LEGAL", sequenceName = "SQ_REPRESENTANTE_LEGAL", allocationSize = 1)
    @Column(name = "id_representante")
    private Long idRepresentante;

    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "telefono")
    private String telefono;
    
    @Column(name = "correo")
    private String correo;
    
    @Column(name = "cargo")
    private String cargo;

    /*@ManyToOne
    @JoinColumn(name = "id_estado", nullable = false)
   
    private EstadoPPP estado_ppp;*/

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "representanteLegal")
    @JsonIgnore
    private Set<Empresa> empresa;

   /* @ManyToOne
    @JoinColumn(name = "id_persona", nullable = false)
    private Persona persona;*/
}
