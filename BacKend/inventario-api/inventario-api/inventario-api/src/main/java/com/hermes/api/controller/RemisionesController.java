package com.hermes.api.controller;

import com.hermes.api.entity.Remision;
import com.hermes.api.service.IRemisionService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class RemisionesController {

    @Autowired
    private IRemisionService serviceRemisiones;

    @GetMapping ("/remisiones")
    public List<Remision> buscarTodos() {
        return serviceRemisiones.buscarTodos();
    }
    
    @PostMapping("/remisiones")
    public Remision guardar(@RequestBody Remision remision) {
    	serviceRemisiones.guardar(remision);
    	return remision;
    }
    
    @PutMapping("/remisiones")
    public Remision modificar(@RequestBody Remision remision) {
    	serviceRemisiones.guardar(remision);
    	return remision;
    }
    
    @GetMapping("/remisiones/{id}")
    public List<Remision> repoRemisiones(@PathVariable("id") int idremision){
    	return serviceRemisiones.searchByIdremision(idremision);
    	
    }
    
}
