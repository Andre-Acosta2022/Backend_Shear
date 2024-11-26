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
@Table(name = "practicante")
public class Practicante {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PRACTICANTE")
    @SequenceGenerator(name = "SQ_PRACTICANTE", sequenceName = "SQ_PRACTICANTE", allocationSize = 1)
    @Column(name = "id_practicante")
    private Long idPracticante;

    @Column(name = "horas_acumuladas")
    private Integer horasAcumuladas;

    @Column(name = "horas_ps")
    private Integer horasPs;

    @ManyToOne
    @JoinColumn(name = "id_plan_carrera", nullable = false)
    private PlanCarrera plan_carrera;

    @ManyToOne
    @JoinColumn(name = "id_estado", nullable = false)
    
    private EstadoPPP estado_ppp;

    @ManyToOne
    @JoinColumn(name = "id_persona", nullable = false)
    private Persona persona;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "practicante")
    @JsonIgnore
    private Set<Practica> practica;
}
