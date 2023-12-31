package com.museo.modelo.servicios;

import java.util.List;
import java.util.Optional;

import com.museo.modelo.entidades.Evento;
import com.museo.util.DetallesEventoBienesPatrimonialesDTO;

public interface EventoService {
    Evento crearEvento(Evento evento);
    Evento actualizarEvento(Evento evento);
    void eliminarEvento(Long eventoId);
    DetallesEventoBienesPatrimonialesDTO obtenerDetallesPorIdBienesPatrimoniales(Long bienPatrimonialId);
    List<Object> obtenerEventosPorPrioridad();
    Optional<Evento> buscarPorId(Long id);
}