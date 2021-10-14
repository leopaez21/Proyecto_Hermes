package com.hermes.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hermes.api.entity.Tipodocumento;
import com.hermes.api.repository.TiposdocRepository;
import com.hermes.api.service.ITipodeDocService;
@Service
public class TipodeDocService implements ITipodeDocService {
	@Autowired
	private TiposdocRepository repoTipodoc;


	public List<Tipodocumento> buscarTodos() {		
		return repoTipodoc.findAll();
	}

}
