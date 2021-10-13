package com.hermes.api.service.jpa;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hermes.api.entity.Tercero;
import com.hermes.api.repository.TercerosRepository;
import com.hermes.api.service.ITerceroService;
@Service
public class TercerosService implements ITerceroService {
	@Autowired
	private TercerosRepository repoTerceros;
	
	public List<Tercero> buscarTodos() {
		
		return repoTerceros.findAll();
	}


	public void guardar(Tercero tercero) {
		repoTerceros.save(tercero);
		
	}

	

}
