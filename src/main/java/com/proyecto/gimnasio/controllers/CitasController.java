package com.proyecto.gimnasio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.gimnasio.dao.CitasDao;
import com.proyecto.gimnasio.models.Citas;

@RestController
@RequestMapping("/api/citas")
public class CitasController {
	
	@Autowired
	CitasDao citasDao;
	
	@PostMapping("/guardar")
	public void guardarCita(@RequestBody Citas cita) {
		citasDao.guardar(cita);
	}
	
	@GetMapping("/listar")
	public ResponseEntity<List<Citas>> listarCitas (){
		return citasDao.listar();
	}
}
