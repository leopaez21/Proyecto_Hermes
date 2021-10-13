package com.hermes.api.service;

import java.util.List;

import com.hermes.api.entity.Producto;

public interface IProductoService {

	List<Producto> buscarTodos();
	void guardar(Producto producto);
	List<Producto> searchByIdproducto(int idproducto);
	
	
}
