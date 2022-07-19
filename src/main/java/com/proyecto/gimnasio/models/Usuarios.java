package com.proyecto.gimnasio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios {
	
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "TIPO_ID")
	private String tipo_id;
	
	@Column(name = "NOMBRE_COMPLETO")
	private String nombre_completo;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "GENERO")
	private String genero;
	
	@Column(name = "FECHA_NACIMIENTO")
	private String fecha_nacimiento;
	
	@Column(name = "CONTRASENA")
	private String contrasena;

	public Usuarios(int id, String tipo_id, String nombre_completo, String email, String genero,
			String fecha_nacimiento, String contrasena) {
		super();
		this.id = id;
		this.tipo_id = tipo_id;
		this.nombre_completo = nombre_completo;
		this.email = email;
		this.genero = genero;
		this.fecha_nacimiento = fecha_nacimiento;
		this.contrasena = contrasena;
	}

	public Usuarios() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo_id() {
		return tipo_id;
	}

	public void setTipo_id(String tipo_id) {
		this.tipo_id = tipo_id;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", tipo_id=" + tipo_id + ", nombre_completo=" + nombre_completo + ", email="
				+ email + ", genero=" + genero + ", fecha_nacimiento=" + fecha_nacimiento + ", contrasena=" + contrasena
				+ "]";
	}

}
