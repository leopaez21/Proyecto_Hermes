package com.hermes.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hermes.api.entity.Ubicacion;
import com.hermes.api.service.IUbicacionService;

@RestController
@RequestMapping ("/api")

public class UbicacionController {
	@Autowired
	private IUbicacionService serviceUbicacion;
	@GetMapping("/ubicacion")
	public List<Ubicacion> buscarTodos() {
		
		return serviceUbicacion.buscarTodos();
	}
	@PostMapping("/ubicacion")
	public Ubicacion guardar(@RequestBody Ubicacion ubicacion) {
		serviceUbicacion.guardar(ubicacion);
		return ubicacion;
	}
	
	@PutMapping("/ubicacion")
	public Ubicacion modificar(@RequestBody Ubicacion ubicacion) {
		serviceUbicacion.guardar(ubicacion);
		return ubicacion;
	}	
}