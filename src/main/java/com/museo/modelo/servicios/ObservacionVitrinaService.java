package com.museo.modelo.servicios;

import com.museo.modelo.entidades.ObservacionVitrina;

import java.util.List;

public interface ObservacionVitrinaService {
    ObservacionVitrina guardarObservacionVitrina(ObservacionVitrina observacionVitrina);
    List<ObservacionVitrina> listarObservacionesVitrina();
    ObservacionVitrina actualizarObservacionVitrina(long id, ObservacionVitrina observacionVitrina);
}
