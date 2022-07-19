package com.proyecto.gimnasio.dao;

import java.util.List;

import com.proyecto.gimnasio.models.Usuarios;

public interface UsuariosDao {

	Object registrar(Usuarios usuario);

	List<Usuarios> listar();

	Usuarios obtenerUsuario(Usuarios usuario);

}
