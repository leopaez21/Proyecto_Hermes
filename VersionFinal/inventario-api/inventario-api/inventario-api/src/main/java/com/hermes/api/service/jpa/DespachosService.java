package com.hermes.api.service.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hermes.api.entity.Despacho;

import com.hermes.api.repository.DespachosRepository;
import com.hermes.api.service.IDespachoService;

@Service
public class DespachosService implements IDespachoService {
	
	@Autowired
	private DespachosRepository repoDespachos;

	public List<Despacho> buscarTodos() {
		return repoDespachos.findAll();
	}

	public void guardar(Despacho despacho) {
		repoDespachos.save(despacho);

	}

	public List<Despacho> searchByIddespacho(int iddespacho) {
		List<Despacho> consuldesp = repoDespachos.searchByIddespacho(iddespacho);

		if (consuldesp.size() > 0) {
			return consuldesp;
		} else {

			return new ArrayList<Despacho>();
		}

	}

	
}
