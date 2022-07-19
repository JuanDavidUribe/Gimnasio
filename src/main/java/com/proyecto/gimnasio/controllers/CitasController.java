package com.proyecto.gimnasio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.gimnasio.dao.CitasDao;

@RestController
@RequestMapping
public class CitasController {
	
	@Autowired
	CitasDao citasDao;
	
	@PostMapping()
	public void guardarCita() {
		citasDao.guardar();
	}
}
