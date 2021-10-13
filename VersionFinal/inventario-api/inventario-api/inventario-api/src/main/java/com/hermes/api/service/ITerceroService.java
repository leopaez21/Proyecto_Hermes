package com.hermes.api.service;

import java.util.List;

import com.hermes.api.entity.Tercero;

public interface ITerceroService {

	List<Tercero> buscarTodos();
	void guardar(Tercero tercero);
	
}
