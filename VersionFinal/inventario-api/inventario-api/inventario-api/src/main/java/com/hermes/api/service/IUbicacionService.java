package com.hermes.api.service;

import java.util.List;

import com.hermes.api.entity.Ubicacion;

public interface IUbicacionService {

	List<Ubicacion> buscarTodos();
	void guardar(Ubicacion ubicacion);
	List<Ubicacion> searchbyIdubicacion(int idubicacion);
	
}
