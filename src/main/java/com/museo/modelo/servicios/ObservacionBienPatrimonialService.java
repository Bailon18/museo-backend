package com.museo.modelo.servicios;

import com.museo.modelo.entidades.ObservacionBienPatrimonial;

import java.util.List;

public interface ObservacionBienPatrimonialService {
    ObservacionBienPatrimonial guardarObservacionBienPatrimonial(ObservacionBienPatrimonial observacionBienPatrimonial);
    List<ObservacionBienPatrimonial> listarObservacionesBienPatrimonial();
    ObservacionBienPatrimonial actualizarObservacionBienPatrimonial(long id, ObservacionBienPatrimonial observacionBienPatrimonial);
    void eliminarObservacionBienPatrimonial(long id);
}
