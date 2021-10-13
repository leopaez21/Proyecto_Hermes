package com.hermes.api.service;

import java.util.List;
import com.hermes.api.entity.Usuario;


public interface IUsuarioService {

	List<Usuario> buscarTodos();
	
	List<Usuario> buscapaginado();
	
	/*Metodo para guardar usuarios y modificar*/
	void guardar(Usuario usuario);
	 
	
	List<Usuario> searchByIdusarioAndUsuario(int idusuario, String usuario );
	
	}
