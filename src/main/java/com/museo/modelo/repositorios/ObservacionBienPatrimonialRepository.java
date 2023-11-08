package com.museo.modelo.repositorios;

import com.museo.modelo.entidades.ObservacionBienPatrimonial;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ObservacionBienPatrimonialRepository extends JpaRepository<ObservacionBienPatrimonial, Long> {
    
	@Query(value = "SELECT * FROM observacionbienpatrimonial " +
            "WHERE observacion_id = :idObservacion",
            nativeQuery = true)
	List<ObservacionBienPatrimonial> listadoOBPxObservacion(@Param("idObservacion") Long idObservacion);
}
