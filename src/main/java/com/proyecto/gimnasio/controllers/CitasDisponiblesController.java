package com.proyecto.gimnasio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.gimnasio.dao.CitasDisponiblesDao;
import com.proyecto.gimnasio.models.CitasDisponibles;

@RestController
@RequestMapping("disponibles")
public class CitasDisponiblesController {

	@Autowired
	CitasDisponiblesDao citasDisponiblesDao;
	
	@RequestMapping("guardar")
	public void guardarCitaDisopnible (@RequestBody CitasDisponibles citasDisponibles) {
		citasDisponiblesDao.guardar(citasDisponibles);
	}
	
	@RequestMapping(value = "listar")
	public List<CitasDisponibles> listar (){
		return citasDisponiblesDao.listar();
	}
	
	
}
