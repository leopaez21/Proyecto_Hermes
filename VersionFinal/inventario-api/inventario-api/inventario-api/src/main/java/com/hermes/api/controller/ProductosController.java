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

import com.hermes.api.entity.Producto;

import com.hermes.api.service.IProductoService;

@RestController
@RequestMapping("/api")
public class ProductosController {
	@Autowired
	private IProductoService serviceProductos;
	
	@GetMapping("/productos")
	public List<Producto> buscarTodos(){
		return serviceProductos.buscarTodos();
	}
	@PostMapping("/productos")
	public Producto guardar(@RequestBody Producto producto) {
		serviceProductos.guardar(producto);
		return producto;
		
		
	}	
	
	@PutMapping("/productos")
	public Producto modificar(@RequestBody Producto producto) {
		serviceProductos.guardar(producto);
		return producto;
		
		
	}	
	@GetMapping("/productos/{id}")
	public List<Producto> repoProductos(@PathVariable("id") int idproducto){
		return serviceProductos.searchByIdproducto(idproducto);
}

}
