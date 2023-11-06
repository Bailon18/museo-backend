package com.museo.modelo.servicios;

import java.util.List;

import com.museo.modelo.entidades.Observacion;

public interface ObservacionService {
    Observacion guardarObservacion(Observacion observacion);
    Observacion obtenerObservacionPorId(long id);
    List<Observacion> obtenerTodasLasObservaciones();
    void eliminarObservacion(long id);
    List<Object[]> getObservationReport();
}
