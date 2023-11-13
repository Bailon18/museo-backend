package com.museo.modelo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.museo.modelo.entidades.Vitrinas;



public interface VitrinasRepository extends JpaRepository<Vitrinas, Long> {
	
	
	@Query(value = "SELECT v.codigo_vitrina, a.nombre, np.nombre, v.estado_vitrina, et.codigo_equipo_tipo, et.unidad_medida " +
	        "FROM vitrinas v " +
	        "INNER JOIN equipos e ON v.equipo_id = e.id " +
	        "INNER JOIN equipo_tipo et ON et.equipos_id = e.id " +
	        "INNER JOIN ambientes a ON v.ambiente_id = a.id " +
	        "INNER JOIN nivelespiso np ON v.nivel_piso_id = np.id " +
	        "WHERE v.codigo_vitrina = :codigoVitrina", nativeQuery = true)
	List<Object[]> findDataByCodigoVitrina(@Param("codigoVitrina") String codigoVitrina);








}
