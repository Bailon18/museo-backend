package com.museo.modelo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.museo.modelo.entidades.BienesPatrimoniales;

public interface BienesPatrimonialesRepository extends JpaRepository<BienesPatrimoniales, Long> {
   
    // Método para buscar bienes patrimoniales según las condiciones especificadas
	@Query(value = "SELECT * FROM bienespatrimoniales bp " +
            "WHERE bp.ubicacion_id = :ubicacion " +  
            "AND (:ambiente IS NULL OR bp.ambiente_id = :ambiente) " +  
            "AND (:nivelpiso IS NULL OR bp.nivelpiso_id = :nivelpiso) " +  
            "AND bp.categoria_id = :categoria", 
            nativeQuery = true)
	List<BienesPatrimoniales> buscarBienesPorCondiciones(@Param("ubicacion") Long ubicacion,
	                                                    @Param("ambiente") Long ambiente,
	                                                    @Param("nivelpiso") Long nivelpiso,
	                                                    @Param("categoria") Long categoria);

}
