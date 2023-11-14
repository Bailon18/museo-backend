package com.museo.modelo.repositorios;

import com.museo.modelo.entidades.CondicionesAmbientalesMonitoreo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CondicionesAmbientalesMonitoreoRepository extends JpaRepository<CondicionesAmbientalesMonitoreo, Long> {
	
    @Query(value = "SELECT cam.id, cam.codigo_condicion, cam.fecha_registro, v.codigo_vitrina, " +
            "a.nombre AS ambiente, np.nombre AS nivelpiso, v.estado_vitrina, " +
            "CASE WHEN cam.humedad BETWEEN MIN(et_hum.rango_minimo) AND MAX(et_hum.rango_maximo) THEN 'ACEPTABLE' ELSE 'NO ACEPTABLE' END AS humedad_alerta, " +
            "CASE WHEN cam.temperatura BETWEEN MIN(et_tem.rango_minimo) AND MAX(et_tem.rango_maximo) THEN 'ACEPTABLE' ELSE 'NO ACEPTABLE' END AS temperatura_alerta, " +
            "CASE WHEN cam.luminosidad BETWEEN MIN(et_lum.rango_minimo) AND MAX(et_lum.rango_maximo) THEN 'ACEPTABLE' ELSE 'NO ACEPTABLE' END AS luminosidad_alerta, " +
            "GROUP_CONCAT(DISTINCT et_tem.codigo_equipo_tipo) AS equipoTipos_tem, " +
            "GROUP_CONCAT(DISTINCT et_hum.codigo_equipo_tipo) AS equipoTipos_hum, " +
            "GROUP_CONCAT(DISTINCT et_lum.codigo_equipo_tipo) AS equipoTipos_lum " +
            "FROM condicionesambientalesmonitoreo cam " +
            "JOIN vitrinas v ON cam.vitrina_id = v.id " +
            "JOIN ambientes a ON v.ambiente_id = a.id " +
            "JOIN nivelespiso np ON v.nivel_piso_id = np.id " +
            "JOIN equipos eq ON v.equipo_id = eq.id " +
            "JOIN equipo_tipo et_hum ON eq.id = et_hum.equipos_id AND et_hum.codigo_equipo_tipo LIKE 'E-HUM%' " +
            "JOIN equipo_tipo et_tem ON eq.id = et_tem.equipos_id AND et_tem.codigo_equipo_tipo LIKE 'E-TEM%' " +
            "JOIN equipo_tipo et_lum ON eq.id = et_lum.equipos_id AND et_lum.codigo_equipo_tipo LIKE 'E-LUM%' " +
            "GROUP BY cam.id, cam.codigo_condicion, cam.fecha_registro, v.codigo_vitrina, a.nombre, np.nombre, v.estado_vitrina " +
            "ORDER BY cam.fecha_registro DESC",
            nativeQuery = true)
    List<Object[]> obtenerCondicionesAmbientalesMonitoreoDTO();
}
