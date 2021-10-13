package com.hermes.api.service.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hermes.api.entity.Ubicacion;
import com.hermes.api.repository.UbicacionRepository;
import com.hermes.api.service.IUbicacionService;

@Service
public class UbicacionService implements IUbicacionService {

	@Autowired
	private UbicacionRepository repoUbicacion;
	public List<Ubicacion> buscarTodos() {

		return repoUbicacion.findAll();
	}
	@Override
	public void guardar(Ubicacion ubicacion) {
		repoUbicacion.save(ubicacion);
			
				
	}
	@Override
	public List<Ubicacion> searchbyIdubicacion(int idubicacion) {
		List<Ubicacion> consultaubi = repoUbicacion.searchByIdubicacion(idubicacion);
		if (consultaubi.size() >0) {
			return consultaubi;
		} else {
		return new ArrayList<Ubicacion>();

	}
  }
	
}
