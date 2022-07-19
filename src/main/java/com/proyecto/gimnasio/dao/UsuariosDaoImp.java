package com.proyecto.gimnasio.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.gimnasio.models.Usuarios;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

@Repository
@Transactional
public class UsuariosDaoImp implements UsuariosDao{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Object registrar(Usuarios usuario) {
		entityManager.merge(usuario);
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuarios> listar() {
		String query = "from Usuarios";
		return entityManager.createQuery(query).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Usuarios obtenerUsuario(Usuarios usuario) {
		String query = "from Usuarios WHERE email = :email";
		List<Usuarios> lista = entityManager.createQuery(query)
			.setParameter("email", usuario.getEmail())
			.getResultList();
		
		if (lista.isEmpty()) {
			return null;
		}
		
		String passwordHashed = lista.get(0).getContrasena();

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        if (argon2.verify(passwordHashed, usuario.getContrasena())) {
            return lista.get(0);
        }
		return null;
	}

}
