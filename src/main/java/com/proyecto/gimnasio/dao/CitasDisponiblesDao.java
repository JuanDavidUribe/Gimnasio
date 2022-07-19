package com.proyecto.gimnasio.dao;

import java.util.List;

import com.proyecto.gimnasio.models.CitasDisponibles;

public interface CitasDisponiblesDao {

	Object guardar(CitasDisponibles citasDisponibles);

	List<CitasDisponibles> listar();

}
