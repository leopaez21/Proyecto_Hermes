package com.hermes.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hermes.api.entity.Ubicacion;

public interface UbicacionRepository extends JpaRepository<Ubicacion, Integer> {

	List<Ubicacion> searchByIdubicacion(int idubicacion);


}
