package com.hermes.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hermes.api.entity.Producto;



public interface ProductosRepository extends JpaRepository<Producto, Integer> {

	@Query("select u from Producto u where u.idproducto = ?1")
	List<Producto> searchByIdproducto(int idproducto);
	
}

