package com.hermes.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hermes.api.entity.Tipodocumento;
import com.hermes.api.service.ITipodeDocService;

@RestController
@RequestMapping("/api")
public class TiposdeDocController {

	@Autowired
	private ITipodeDocService serviceTipodoc;
	
	@GetMapping("/tiposdocumento")
	public List<Tipodocumento>  buscarTodos() {
		return serviceTipodoc.buscarTodos();
		
	}
	
}
