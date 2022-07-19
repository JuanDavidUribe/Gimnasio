package com.proyecto.gimnasio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.gimnasio.dao.UsuariosDao;
import com.proyecto.gimnasio.models.Usuarios;
import com.proyecto.gimnasio.utils.JWTUtil;

@RestController
@RequestMapping (value = "auth")
public class Authcontroller {

	@Autowired
	private UsuariosDao usuariosDao;
	
	@Autowired
	private JWTUtil jwtUtil;
	
	@RequestMapping(value = "/iniciarSesion")
	public String iniciarSesion (@RequestBody Usuarios usuario) {
		Usuarios usuarioLog = usuariosDao.obtenerUsuario(usuario);
		if (usuarioLog != null) {
			return jwtUtil.create(String.valueOf(usuarioLog.getId()), usuarioLog.getEmail());
			
		}
		return "fail";
	}

}
