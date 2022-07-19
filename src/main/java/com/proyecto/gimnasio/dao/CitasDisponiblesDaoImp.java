package com.proyecto.gimnasio.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.gimnasio.models.CitasDisponibles;

@Repository
@Transactional
public class CitasDisponiblesDaoImp implements CitasDisponiblesDao{

	@Autowired
	EntityManager entityManager;
	
	@Override
	public Object guardar(CitasDisponibles citasDisponibles) {
		entityManager.merge(citasDisponibles);
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CitasDisponibles> listar() {
		String query = "from CitasDisponibles";
		return entityManager.createQuery(query).getResultList();
	}

}
