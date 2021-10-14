package com.hermes.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hermes.api.entity.Zona;
import com.hermes.api.service.IZonaService;

public class ZonasController {

	@Autowired
	private IZonaService serviceZona;

	@GetMapping("/zonas")
	public List<Zona> buscarTodos() {
		return serviceZona.buscarTodos();

	}

	@PostMapping("/zonas")
	public Zona guardar(@RequestBody Zona zona) {
		serviceZona.guardar(zona);
		return zona;

	}

	@PutMapping("/zonas")
	public Zona modificar(@RequestBody Zona zona) {
		serviceZona.guardar(zona);
		return zona;

	}

}
