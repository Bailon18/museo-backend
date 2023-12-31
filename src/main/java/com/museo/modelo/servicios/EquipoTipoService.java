package com.museo.modelo.servicios;

import com.museo.modelo.entidades.EquipoTipo;

import java.util.List;

public interface EquipoTipoService {
    List<EquipoTipo> listarEquiposTipo();
    EquipoTipo obtenerEquipoTipoPorId(Long id);
    EquipoTipo crearEquipoTipo(EquipoTipo equipoTipo);
    EquipoTipo actualizarEquipoTipo(Long id, EquipoTipo equipoTipo);
    void eliminarEquipoTipo(Long id);
    List<EquipoTipo> findEquipoTipoByEquiposId(Long equiposId);
}
