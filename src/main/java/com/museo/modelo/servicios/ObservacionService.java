package com.museo.modelo.servicios;

import java.util.List;

import com.museo.modelo.entidades.Observacion;
import com.museo.util.ObservacionDetalleDTO;

public interface ObservacionService {
    Observacion guardarObservacion(Observacion observacion);
    ObservacionDetalleDTO  obtenerObservacionPorId(long id);
    List<Observacion> obtenerTodasLasObservaciones();
    void eliminarObservacion(long id);
    List<Object[]> getObservationReport();
}
