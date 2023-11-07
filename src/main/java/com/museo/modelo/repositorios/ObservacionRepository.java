package com.museo.modelo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.museo.modelo.entidades.Observacion;

public interface ObservacionRepository extends JpaRepository<Observacion, Long> {
    
    @Query(nativeQuery = true, value = "SELECT o.id, o.codigo_observacion AS 'Cod. Observación', " +
            "MAX(v.codigo_vitrina) AS 'Cod. Vitrina', " +
            "MAX(a.nombre) AS 'Ambiente', " +
            "MAX(n.nombre) AS 'Nivel de Piso', " +
            "MAX(ap.estado) AS 'Estado de Resultados (Aprobado)', " +
            "MAX(rv.descripcion) AS 'Resultado vitrina', " +
            "MAX(ov.fecha_registro) AS 'Fecha de registro' " +
            "FROM observaciones o " +
            "JOIN observacionvitrina ov ON o.id = ov.observacion_id " +
            "JOIN vitrinas v ON ov.vitrina_id = v.id " +
            "LEFT JOIN nivelespiso n ON v.nivel_piso_id = n.id " +
            "JOIN ambientes a ON v.ambiente_id = a.id " +
            "LEFT JOIN aprobacion ap ON (SELECT obp1.aprobacion_id FROM observacionbienpatrimonial obp1 WHERE obp1.observacion_id = o.id LIMIT 1) = ap.id " +
            "LEFT JOIN resultado rv ON (SELECT ov.resultado_id FROM observacionvitrina ov WHERE ov.observacion_id = o.id LIMIT 1) = rv.id " +
            "WHERE EXISTS (SELECT 1 FROM observacionbienpatrimonial obp WHERE obp.observacion_id = o.id) " +
            "GROUP BY o.id")
    List<Object[]> getObservationReport1();
    
    
    @Query(nativeQuery = true, value = "WITH ResultadosNumerados AS ( " +
            "SELECT " +
            "obp.observacion_id, " +
            "r.descripcion AS 'Resultado', " +
            "ROW_NUMBER() OVER (PARTITION BY obp.observacion_id ORDER BY obp.id) AS 'NumeroResultado' " +
            "FROM " +
            "observacionbienpatrimonial obp " +
            "JOIN resultado r ON obp.resultado_id = r.id " +
            ") " +
            "SELECT " +
            "MAX(CASE WHEN NumeroResultado = 1 THEN Resultado END) AS '#1_Resultado_BienPatrimonial', " +
            "MAX(CASE WHEN NumeroResultado = 2 THEN Resultado END) AS '#2_Resultado_BienPatrimonial', " +
            "MAX(CASE WHEN NumeroResultado = 3 THEN Resultado END) AS '#3_Resultado_BienPatrimonial' " +
            "FROM ResultadosNumerados rn " +
            "GROUP BY rn.observacion_id")
    List<Object[]> getObservationReport2();
    
    
}