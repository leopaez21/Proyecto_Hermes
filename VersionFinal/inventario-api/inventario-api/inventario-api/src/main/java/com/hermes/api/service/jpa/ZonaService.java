package com.hermes.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hermes.api.entity.Zona;
import com.hermes.api.repository.ZonasRepository;
import com.hermes.api.service.IZonaService;

@Service
public class ZonaService implements IZonaService {
	
	@Autowired
	private ZonasRepository repoZonas;

	
	public List<Zona> buscarTodos() {
		// TODO Auto-generated method stub
		return repoZonas.findAll();
	}

	
	public void guardar(Zona zona) {
		repoZonas.save(zona);

	}


	@Override
	public List<Zona> searchByidzona(int idzona) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void modificar(Zona zona) {
		// TODO Auto-generated method stub
		
	}

}
