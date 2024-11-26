package com.example.demo.dto;

public class RegistroDTO {

	private String nombreEmpresa;
    private String rucEmpresa;
    private String telefonoEmpresa;
    private String correoEmpresa;
    private String departamentoUbigeo;
    private String distritoUbigeo;
    private String provinciaUbigeo;
    private String direccionEmpresa;
    
    private String nombreRepresentante;
    private String cargoRepresentante;
    private String correoRepresentante;
    private String telefonoRepresentante;
    
	public RegistroDTO(String nombreEmpresa, String rucEmpresa, String telefonoEmpresa, String correoEmpresa,
			String departamentoUbigeo, String distritoUbigeo, String provinciaUbigeo, String direccionEmpresa,
			String nombreRepresentante, String cargoRepresentante, String correoRepresentante,
			String telefonoRepresentante) {
		
		this.nombreEmpresa = nombreEmpresa;
		this.rucEmpresa = rucEmpresa;
		this.telefonoEmpresa = telefonoEmpresa;
		this.correoEmpresa = correoEmpresa;
		this.departamentoUbigeo = departamentoUbigeo;
		this.distritoUbigeo = distritoUbigeo;
		this.provinciaUbigeo = provinciaUbigeo;
		this.direccionEmpresa = direccionEmpresa;
		this.nombreRepresentante = nombreRepresentante;
		this.cargoRepresentante = cargoRepresentante;
		this.correoRepresentante = correoRepresentante;
		this.telefonoRepresentante = telefonoRepresentante;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getRucEmpresa() {
		return rucEmpresa;
	}
	public void setRucEmpresa(String rucEmpresa) {
		this.rucEmpresa = rucEmpresa;
	}
	public String getTelefonoEmpresa() {
		return telefonoEmpresa;
	}
	public void setTelefonoEmpresa(String telefonoEmpresa) {
		this.telefonoEmpresa = telefonoEmpresa;
	}
	public String getCorreoEmpresa() {
		return correoEmpresa;
	}
	public void setCorreoEmpresa(String correoEmpresa) {
		this.correoEmpresa = correoEmpresa;
	}
	public String getDepartamentoUbigeo() {
		return departamentoUbigeo;
	}
	public void setDepartamentoUbigeo(String departamentoUbigeo) {
		this.departamentoUbigeo = departamentoUbigeo;
	}
	public String getDistritoUbigeo() {
		return distritoUbigeo;
	}
	public void setDistritoUbigeo(String distritoUbigeo) {
		this.distritoUbigeo = distritoUbigeo;
	}
	public String getProvinciaUbigeo() {
		return provinciaUbigeo;
	}
	public void setProvinciaUbigeo(String provinciaUbigeo) {
		this.provinciaUbigeo = provinciaUbigeo;
	}
	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}
	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}
	public String getNombreRepresentante() {
		return nombreRepresentante;
	}
	public void setNombreRepresentante(String nombreRepresentante) {
		this.nombreRepresentante = nombreRepresentante;
	}
	public String getCargoRepresentante() {
		return cargoRepresentante;
	}
	public void setCargoRepresentante(String cargoRepresentante) {
		this.cargoRepresentante = cargoRepresentante;
	}
	public String getCorreoRepresentante() {
		return correoRepresentante;
	}
	public void setCorreoRepresentante(String correoRepresentante) {
		this.correoRepresentante = correoRepresentante;
	}
	public String getTelefonoRepresentante() {
		return telefonoRepresentante;
	}
	public void setTelefonoRepresentante(String telefonoRepresentante) {
		this.telefonoRepresentante = telefonoRepresentante;
	}
	
    
    
}
