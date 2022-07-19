package com.proyecto.gimnasio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.gimnasio.dao.CitasDisponiblesDao;
import com.proyecto.gimnasio.models.CitasDisponibles;

@RestController
@RequestMapping("/api/disponibles")
public class CitasDisponiblesController {

	@Autowired
	CitasDisponiblesDao citasDisponiblesDao;
	
	@PostMapping("/guardar")
	public String guardarCitaDisopnible (@RequestBody CitasDisponibles citasDisponibles) {
		try {
			citasDisponiblesDao.guardar(citasDisponibles);	
			return "ok";
		} catch (Exception e) {
			return "fail";
		}
	}
	
	@GetMapping("/listar")
	public List<CitasDisponibles> listar (){
		return citasDisponiblesDao.listar();
	}
	
	
}
