package com.example.demo.dto;


public class DetalleSolicitudDTO {
	
	
    private String nombreEmpresa;
    private String rucEmpresa;
    private String direccionEmpresa;
    private String correoEmpresa;
    private String nombreLinea;
    
    private String nombreRepresentante;
    private String cargoRepresentante;
    private String correoRepresentante;
    private String telefonoRepresentante;
    
	public DetalleSolicitudDTO(String nombreEmpresa, String rucEmpresa, String direccionEmpresa, String correoEmpresa,
			String nombreLinea, String nombreRepresentante, String cargoRepresentante, String correoRepresentante,
			String telefonoRepresentante) {
		
		this.nombreEmpresa = nombreEmpresa;
		this.rucEmpresa = rucEmpresa;
		this.direccionEmpresa = direccionEmpresa;
		this.correoEmpresa = correoEmpresa;
		this.nombreLinea = nombreLinea;
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

	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}

	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}

	public String getCorreoEmpresa() {
		return correoEmpresa;
	}

	public void setCorreoEmpresa(String correoEmpresa) {
		this.correoEmpresa = correoEmpresa;
	}

	public String getNombreLinea() {
		return nombreLinea;
	}

	public void setNombreLinea(String nombreLinea) {
		this.nombreLinea = nombreLinea;
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
