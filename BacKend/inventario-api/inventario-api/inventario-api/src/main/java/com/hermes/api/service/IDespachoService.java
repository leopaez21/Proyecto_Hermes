package com.hermes.api.service;

import java.util.List;
import com.hermes.api.entity.Despacho;


public interface IDespachoService {
	
	List<Despacho> buscarTodos();
	void guardar(Despacho despacho);
	List<Despacho> searchByIddespacho(int iddespacho);

}
