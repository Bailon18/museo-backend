package com.museo.modelo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.museo.modelo.entidades.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
  
    @Query(value = "SELECT " +
            "u.nombre AS nombreUbicacion, " +
            "np.nombre AS nombreNivelPiso, " +
            "bp.rni, " +
            "cat.nombre AS nombreCategoria, " +
            "col.nombre AS nombreColeccion, " +
            "cult.nombre AS nombreCultura, " +
            "etc.estado AS nombreEstadoConservacion, " +
            "bp.tipo_material, " +
            "bp.denominacion, " +
            "bp.tematica, " +
            "bp.codigo_bien_patrimonial, " +
            "a.descripcion AS nombreAnomalia, " +
            "ta.descripcion AS nombreTipoAnomalia, " +
            "g.descripcion AS nombreGravedad, " +
            "r.descripcion AS nombreResultado, " +
            "op.fecha_registro AS ObservacionBPFe " +
            "FROM bienespatrimoniales bp " +
            "JOIN ( " +
            "    SELECT * " +
            "    FROM observacionbienpatrimonial " +
            "    WHERE bien_patrimonial_id = :bienPatrimonialId " +
            "    ORDER BY fecha_registro DESC " +
            "    LIMIT 1 " +
            ") op ON bp.id = op.bien_patrimonial_id " +
            "LEFT JOIN anomalias a ON op.anomalia_id = a.id " +
            "LEFT JOIN tiposanomalias ta ON op.tipo_anomalia_id = ta.id " +
            "LEFT JOIN gravedad g ON op.gravedad_id = g.id " +
            "LEFT JOIN resultado r ON op.resultado_id = r.id " +
            "LEFT JOIN ubicaciones u ON bp.ubicacion_id = u.id " +
            "LEFT JOIN nivelespiso np ON bp.nivelpiso_id = np.id " +
            "LEFT JOIN categorias cat ON bp.categoria_id = cat.id " +
            "LEFT JOIN colecciones col ON bp.coleccion_id = col.id " +
            "LEFT JOIN culturas cult ON bp.cultura_id = cult.id " +
            "LEFT JOIN estadosconservacion etc ON bp.estado_conservacion_id = etc.id", nativeQuery = true)
    Object obtenerDetallesPorIdBienesPatrimoniales(@Param("bienPatrimonialId") Long bienPatrimonialId);
	
}