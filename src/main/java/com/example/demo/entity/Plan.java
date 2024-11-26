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
@Table(name = "plan")
public class Plan {

	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PLAN")
    @SequenceGenerator(name = "SQ_PLAN", sequenceName = "SQ_PLAN", allocationSize = 1)
	@Column(name = "id_plan")
	private Long idPlan;

	@Column(name = "plan", nullable = false)
	private String plan;

	@ManyToOne
	@JoinColumn(name = "id_estado", nullable = false)

	private EstadoPPP estado_ppp;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "plan")
	@JsonIgnore
	private Set<PlanCarrera> plan_carrera;
}
