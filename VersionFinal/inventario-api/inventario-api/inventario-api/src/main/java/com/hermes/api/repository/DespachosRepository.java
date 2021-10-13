package com.hermes.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hermes.api.entity.Despacho;

public interface DespachosRepository extends JpaRepository<Despacho, Integer> {
	
	@Query("select u from Despacho u where u.iddespacho = ?1")
	List<Despacho> searchByIddespacho(int iddespacho);
	

}
