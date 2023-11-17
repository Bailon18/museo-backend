package com.museo.modelo.repositorios;

import com.museo.modelo.entidades.Observacion;
import com.museo.modelo.entidades.ObservacionBienPatrimonial;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

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
	
    @Transactional
    void deleteByObservacion(Observacion observacion);

    @Query(value = "SELECT * FROM observacionbienpatrimonial " +
                   "WHERE bien_patrimonial_id = :bienPatrimonialId " +
                   "ORDER BY fecha_registro DESC LIMIT 1", nativeQuery = true)
    Optional<ObservacionBienPatrimonial> findLatestObservacionByBienPatrimonialId(long bienPatrimonialId);
}
