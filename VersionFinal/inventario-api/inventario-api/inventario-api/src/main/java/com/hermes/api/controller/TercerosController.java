package com.hermes.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hermes.api.entity.Tercero;
import com.hermes.api.service.ITerceroService;

@RestController
@RequestMapping("/api")

public class TercerosController {
	@Autowired
	private ITerceroService serviceTerceros;

	@GetMapping("/terceros")
	public List<Tercero> buscarTodos() {
		return serviceTerceros.buscarTodos();

	}

	@PostMapping("/terceros")
	public Tercero guardar(@RequestBody Tercero tercero) {
		serviceTerceros.guardar(tercero);
		return tercero;
	}

	@PutMapping("/terceros")
	public Tercero modificar(@RequestBody Tercero tercero) {
		serviceTerceros.guardar(tercero);
		return tercero;
	}

}
