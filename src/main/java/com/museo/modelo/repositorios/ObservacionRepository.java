package com.museo.modelo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.museo.modelo.entidades.Observacion;

public interface ObservacionRepository extends JpaRepository<Observacion, Long> {
    
    @Query(value = "SELECT ob.id AS 'Cod. Observación', " +
            "v.id AS 'Cod. Vitrina', " +
            "v.ambiente AS 'Ambiente', " +
            "v.nivel_piso AS 'Nivel de Piso', " +
            "CASE " +
            "WHEN ob.estado_resultados = 'Aprobado' THEN 'Aprobado' " +
            "WHEN ob.estado_resultados = 'Sin aprobar' THEN 'Sin aprobar' " +
            "ELSE NULL " +
            "END AS 'Estado de Resultados', " +
            "ob.resultado AS 'Resultado vitrina', " +
            "obp1.resultado AS '#1. Resultado Bien Patrimonial', " +
            "obp2.resultado AS '#2. Resultado Bien Patrimonial', " +
            "obp3.resultado AS '#3. Resultado Bien Patrimonial', " +
            "ob.fecha_registro AS 'Fecha de registro' " +
            "FROM observacionvitrina ob " +
            "LEFT JOIN vitrinas v ON ob.vitrina_id = v.id " +
            "LEFT JOIN observacionbienpatrimonial obp1 ON ob.id = obp1.observacion_id " +
            "AND obp1.row_num = 1 " +
            "LEFT JOIN observacionbienpatrimonial obp2 ON ob.id = obp2.observacion_id " +
            "AND obp2.row_num = 2 " +
            "LEFT JOIN observacionbienpatrimonial obp3 ON ob.id = obp3.observacion_id " +
            "AND obp3.row_num = 3", nativeQuery = true)
    List<Object[]> getObservationReport();
}