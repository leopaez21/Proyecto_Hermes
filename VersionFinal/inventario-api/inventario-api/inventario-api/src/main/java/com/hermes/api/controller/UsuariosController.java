package com.hermes.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hermes.api.entity.Usuario;

import com.hermes.api.service.IUsuarioService;

@RestController
@RequestMapping("/api")
public class UsuariosController {

	@Autowired
	private IUsuarioService serviceUsuarios;

	@GetMapping("/usuarios")
	public List<Usuario> buscarTodos() {
		return serviceUsuarios.buscarTodos();
	}

	@GetMapping("/usuaripag")
	public List<Usuario> buscapaginado() {
		return serviceUsuarios.buscapaginado();
	}

	@PostMapping("/usuarios")
	public Usuario guardar(@RequestBody Usuario usuario) {
		serviceUsuarios.guardar(usuario);
		return usuario;
	}

	@PutMapping("/usuarios")
	public Usuario modificar(@RequestBody Usuario usuario) {
		serviceUsuarios.guardar(usuario);
		return usuario;
	}
	
	@GetMapping("/usuarios/{id}/{id2}")
	public List<Usuario> repoUsuarios(@PathVariable("id") int idusuario, @PathVariable("id2") String usuario){
				return serviceUsuarios.searchByIdusarioAndUsuario(idusuario, usuario);
	}

}
