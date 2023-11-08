package com.museo.modelo.repositorios;

import com.museo.modelo.entidades.ObservacionVitrina;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ObservacionVitrinaRepository extends JpaRepository<ObservacionVitrina, Long> {
  
	@Query(value = "SELECT * FROM observacionvitrina " +
            "WHERE observacion_id = :idObservacion",
            nativeQuery = true)
	ObservacionVitrina listadoOvitrinaxObservacion(@Param("idObservacion") Long idObservacion);
}
