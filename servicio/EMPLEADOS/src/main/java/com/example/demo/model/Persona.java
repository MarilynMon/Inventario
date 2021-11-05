package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "persona")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	public Persona(Long id, String cedula, String nombres, String apellidos, 
			String correo, String usuario, String contras, String fecha, String telefono,
			String direccion, Boolean estado_vac) {
		this.id = id;
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
		this.usuario = usuario;
		this.contras = contras;
		this.fecha = fecha;
		this.direccion = direccion;
		this.telefono = telefono;
		this.estado_vac = estado_vac;
	}
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String cedula;
	private String nombres;
	private String apellidos;
	private String correo;
	private String usuario;
	private String contras;
	private String direccion;
	private String telefono;
	private Boolean estado_vac;
	private String fecha;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getusuario() {
		return usuario;
	}
	public void setusuario(String usuario) {
		this.usuario = usuario;
	}
	public String getcontras() {
		return contras;
	}
	public void setcontras(String contras) {
		this.contras = contras;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Boolean getEstado_vac() {
		return estado_vac;
	}
	public void setEstado_vac(Boolean estado_vac) {
		this.estado_vac = estado_vac;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
