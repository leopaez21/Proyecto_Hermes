package com.hermes.api.service.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hermes.api.entity.Producto;
import com.hermes.api.repository.ProductosRepository;
import com.hermes.api.service.IProductoService;
@Service
public class ProductosService implements IProductoService {
	
	@Autowired
	private ProductosRepository repoProductos;
	
	public List<Producto> buscarTodos() {
		return repoProductos.findAll();
	}
	
	public void guardar(Producto producto) {
		repoProductos.save(producto);
	}
	
	public List<Producto> searchByIdproducto(int idproducto) {
		List<Producto> consultaprod = repoProductos.searchByIdproducto(idproducto);
		if(consultaprod.size() > 0) {
			return consultaprod;
		} else {
			return new ArrayList<Producto>();
		}
	}

}
