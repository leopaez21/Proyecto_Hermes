package com.hermes.api.service;

import java.util.List;

import com.hermes.api.entity.Zona;

public interface IZonaService {
	
	List<Zona> buscarTodos();
	void guardar(Zona zona);
	List<Zona> searchByidzona(int idzona);
	void modificar(Zona zona);

}
