package com.hermes.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hermes.api.entity.Usuario;


public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

	@Query("select u from Usuario u where u.idusuario = ?1 and u.usuario = ?2")
	List<Usuario> searchByIdusarioAndUsuario(int idusuario, String usuario);
	
}
