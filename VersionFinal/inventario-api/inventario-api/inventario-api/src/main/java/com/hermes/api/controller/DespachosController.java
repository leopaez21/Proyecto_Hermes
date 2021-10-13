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

import com.hermes.api.entity.Despacho;
import com.hermes.api.service.IDespachoService;

@RestController
@RequestMapping("/api")
public class DespachosController {
	@Autowired
	private IDespachoService serviceDespachos;
	
	@GetMapping("/despachos")
	public List<Despacho> buscarTodos(){
		return serviceDespachos.buscarTodos();
	}
	@PostMapping("/despachos") 
	public Despacho guardar(@RequestBody Despacho despacho) {
		serviceDespachos.guardar(despacho);
		return despacho;
	}
	
	@PutMapping("/despachos") 
	public Despacho modificar(@RequestBody Despacho despacho) {
		serviceDespachos.guardar(despacho);
		return despacho;
	}
	
	@GetMapping("/despachos/{id}")
	public List<Despacho> repoDespachos(@PathVariable("id") int iddespacho){
		return serviceDespachos.searchByIddespacho(iddespacho);
	}

}
