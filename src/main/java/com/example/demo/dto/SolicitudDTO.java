package com.example.demo.dto;

import java.time.LocalDate;

public class SolicitudDTO {
	
	private Long idPractica;
    private String nombrePersona ;
    private String apellidoPersona ;
    private String codigoPersona;
    private String nombreEmpresa ;
    private String nombreLinea ;
    private String planPlan;
    private String nombreCarrera;
    private String tipoSupervisor;  
    private LocalDate fechaInicioPractica;
    private LocalDate fechaFinPractica;  
    private Integer horasPlanPractica;
    private Double notaAcademicaPractica;
    private Double notaEmpresarialPractica;
    private Double ponderadoFinalPractica;
    private String estadoEstado;
    
	public SolicitudDTO(Long idPractica, String nombrePersona, String apellidoPersona, String codigoPersona,
			String nombreEmpresa, String nombreLinea, String planPlan, String nombreCarrera, String tipoSupervisor,
			LocalDate fechaInicioPractica, LocalDate fechaFinPractica, Integer horasPlanPractica,
			Double notaAcademicaPractica, Double notaEmpresarialPractica, Double ponderadoFinalPractica,
			String estadoEstado) {
		this.idPractica = idPractica;
		this.nombrePersona = nombrePersona;
		this.apellidoPersona = apellidoPersona;
		this.codigoPersona = codigoPersona;
		this.nombreEmpresa = nombreEmpresa;
		this.nombreLinea = nombreLinea;
		this.planPlan = planPlan;
		this.nombreCarrera = nombreCarrera;
		this.tipoSupervisor = tipoSupervisor;
		this.fechaInicioPractica = fechaInicioPractica;
		this.fechaFinPractica = fechaFinPractica;
		this.horasPlanPractica = horasPlanPractica;
		this.notaAcademicaPractica = notaAcademicaPractica;
		this.notaEmpresarialPractica = notaEmpresarialPractica;
		this.ponderadoFinalPractica = ponderadoFinalPractica;
		this.estadoEstado = estadoEstado;
	}
	public Long getIdPractica() {
		return idPractica;
	}
	public void setIdPractica(Long idPractica) {
		this.idPractica = idPractica;
	}
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public String getApellidoPersona() {
		return apellidoPersona;
	}
	public void setApellidoPersona(String apellidoPersona) {
		this.apellidoPersona = apellidoPersona;
	}
	public String getCodigoPersona() {
		return codigoPersona;
	}
	public void setCodigoPersona(String codigoPersona) {
		this.codigoPersona = codigoPersona;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getNombreLinea() {
		return nombreLinea;
	}
	public void setNombreLinea(String nombreLinea) {
		this.nombreLinea = nombreLinea;
	}
	public String getPlanPlan() {
		return planPlan;
	}
	public void setPlanPlan(String planPlan) {
		this.planPlan = planPlan;
	}
	public String getNombreCarrera() {
		return nombreCarrera;
	}
	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	public String getTipoSupervisor() {
		return tipoSupervisor;
	}
	public void setTipoSupervisor(String tipoSupervisor) {
		this.tipoSupervisor = tipoSupervisor;
	}
	public LocalDate getFechaInicioPractica() {
		return fechaInicioPractica;
	}
	public void setFechaInicioPractica(LocalDate fechaInicioPractica) {
		this.fechaInicioPractica = fechaInicioPractica;
	}
	public LocalDate getFechaFinPractica() {
		return fechaFinPractica;
	}
	public void setFechaFinPractica(LocalDate fechaFinPractica) {
		this.fechaFinPractica = fechaFinPractica;
	}
	public Integer getHorasPlanPractica() {
		return horasPlanPractica;
	}
	public void setHorasPlanPractica(Integer horasPlanPractica) {
		this.horasPlanPractica = horasPlanPractica;
	}
	public Double getNotaAcademicaPractica() {
		return notaAcademicaPractica;
	}
	public void setNotaAcademicaPractica(Double notaAcademicaPractica) {
		this.notaAcademicaPractica = notaAcademicaPractica;
	}
	public Double getNotaEmpresarialPractica() {
		return notaEmpresarialPractica;
	}
	public void setNotaEmpresarialPractica(Double notaEmpresarialPractica) {
		this.notaEmpresarialPractica = notaEmpresarialPractica;
	}
	public Double getPonderadoFinalPractica() {
		return ponderadoFinalPractica;
	}
	public void setPonderadoFinalPractica(Double ponderadoFinalPractica) {
		this.ponderadoFinalPractica = ponderadoFinalPractica;
	}
	public String getEstadoEstado() {
		return estadoEstado;
	}
	public void setEstadoEstado(String estadoEstado) {
		this.estadoEstado = estadoEstado;
	}

   
    
    
}
