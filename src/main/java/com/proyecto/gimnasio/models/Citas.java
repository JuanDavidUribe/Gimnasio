package com.proyecto.gimnasio.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Table(name = "citas")
public class Citas {
	@Id
	@Column
	private int id;

	@Column
	private int id_profesor;
	
	@Column
	private String nombre;
	
	@Column
	private LocalDateTime fecha_inicio;
	
	@Column
	private LocalDateTime fecha_fin;

	public Citas(int id, int id_profesor, String nombre, LocalDateTime fecha_inicio, LocalDateTime fecha_fin) {
		super();
		this.id = id;
		this.id_profesor = id_profesor;
		this.nombre = nombre;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_profesor() {
		return id_profesor;
	}

	public void setId_profesor(int id_profesor) {
		this.id_profesor = id_profesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(LocalDateTime fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public LocalDateTime getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(LocalDateTime fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

}
