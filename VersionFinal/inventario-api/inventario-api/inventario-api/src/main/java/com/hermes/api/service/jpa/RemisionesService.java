package com.hermes.api.service.jpa;

import com.hermes.api.entity.Remision;
import com.hermes.api.repository.RemisionesRepository;
import com.hermes.api.service.IRemisionService;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemisionesService implements IRemisionService {

    @Autowired
    private RemisionesRepository repoRemisiones;

    public List<Remision> buscarTodos() {
        return repoRemisiones.findAll();
    }

	@Override
	public void guardar(Remision remision) {
		repoRemisiones.save(remision);
		
	}

	@Override
	public List<Remision> searchByIdremision(int idremision) {
		List<Remision> consultaremi = repoRemisiones.searchByIdremision(idremision);
		if (consultaremi.size() >0) {
			  return consultaremi;
		} else {
		return new ArrayList<Remision>();
		
	}
  }
}
