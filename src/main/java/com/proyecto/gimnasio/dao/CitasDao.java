package com.proyecto.gimnasio.dao;

import java.util.List;

import com.proyecto.gimnasio.models.Citas;

public interface CitasDao {

	void guardar(Citas cita);

	List<Citas> listar();

}
