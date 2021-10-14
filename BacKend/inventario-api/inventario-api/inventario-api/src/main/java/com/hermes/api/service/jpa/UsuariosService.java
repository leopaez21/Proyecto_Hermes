package com.hermes.api.service.jpa;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.hermes.api.entity.Usuario;

import com.hermes.api.repository.UsuariosRepository;
import com.hermes.api.service.IUsuarioService;


@Service
public class UsuariosService implements IUsuarioService {

	@Autowired
	private UsuariosRepository repoUsuarios;

	public List<Usuario> buscarTodos() {
		return repoUsuarios.findAll();
	}
		
	public List<Usuario> buscapaginado() {
		Page<Usuario> page = repoUsuarios.findAll(PageRequest.of(0, 1));
		return page.toList();
	}

	public void guardar(Usuario usuario) {
		repoUsuarios.save(usuario);
	}
	
	public List<Usuario> searchByIdusarioAndUsuario(int idusuario, String usuario) {
		List<Usuario> consulusu = repoUsuarios.searchByIdusarioAndUsuario(idusuario,usuario);
		if (consulusu.size() > 0) {
			return consulusu;
		} else {
			return new ArrayList<Usuario>();
		}
		
	}
	
}
