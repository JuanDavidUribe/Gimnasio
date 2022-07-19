package com.proyecto.gimnasio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.gimnasio.dao.UsuariosDao;
import com.proyecto.gimnasio.models.Usuarios;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

@RestController
@RequestMapping(value = "usuarios")
public class UsuariosController {
	
	@Autowired
	private UsuariosDao usuariosDao;
	
	@RequestMapping(value = "/registrar")
	public void registrarUsuario(@RequestBody Usuarios usuario) {
		Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
		String hash = argon2.hash(1, 1024, 1, usuario.getContrasena());
		usuario.setContrasena(hash);
		usuariosDao.registrar(usuario);
	}
	
	@RequestMapping(value = "/listar")
	public List<Usuarios> listar (){
		return usuariosDao.listar();
	}

}
