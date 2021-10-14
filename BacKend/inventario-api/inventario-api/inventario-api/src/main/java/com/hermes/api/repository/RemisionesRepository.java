
package com.hermes.api.repository;


import com.hermes.api.entity.Remision;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface RemisionesRepository extends JpaRepository <Remision, Integer>{
    
	@Query("select u from Remision u where u.idremision = ?1")
	List<Remision> searchByIdremision(int idremision);
}
