package com.proyecto.gimnasio.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.gimnasio.models.Citas;

@Repository
@Transactional
public class CitasDaoImp implements CitasDao{
	
	@Autowired
	EntityManager entityManager;

	@Override
	public void guardar(Citas cita) {
		entityManager.merge(cita);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Citas> listar() {
		String query = "from Citas";
		return entityManager.createQuery(query).getResultList();
	}

}
