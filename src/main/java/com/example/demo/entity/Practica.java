package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;
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
@Table(name = "practica")
public class Practica {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PRACTICA")
    @SequenceGenerator(name = "SQ_PRACTICA", sequenceName = "SQ_PRACTICA", allocationSize = 1)
    @Column(name = "id_practica")
    private Long idPractica;

    @Column(name = "fecha_inicio")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaFin;

    @Column(name = "horas_plan")
    private Integer horasPlan;

    @Column(name = "nota_academica")
    private Double notaAcademica;

    @Column(name = "nota_empresarial")
    private Double notaEmpresarial;

    @Column(name = "ponderado_final")
    private Double ponderadoFinal;

    @ManyToOne
    @JoinColumn(name = "id_linea", nullable = false)
    
    private Linea linea;

    @ManyToOne
    @JoinColumn(name = "id_supervisor", nullable = false)
    
    private Supervisor supervisor;

    @ManyToOne
    @JoinColumn(name = "id_estado", nullable = false)
    
    private EstadoPPP estadoPPP;

    @ManyToOne
    @JoinColumn(name = "id_plan_carrera", nullable = false)
    
    private PlanCarrera plan_carrera;

    @ManyToOne
    @JoinColumn(name = "id_practicante", nullable = false)
    
    private Practicante practicante;

    @ManyToOne
    @JoinColumn(name = "id_empresa", nullable = false)
    
    private Empresa empresa;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "practica")
    @JsonIgnore
    private Set<EvaluacionAcademica> evaluacion_academica;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "practica")
    @JsonIgnore
    private Set<Documentacion> documentacion;

}
