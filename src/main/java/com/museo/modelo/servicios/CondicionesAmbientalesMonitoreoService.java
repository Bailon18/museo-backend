package com.museo.modelo.servicios;

import com.museo.modelo.entidades.CondicionesAmbientalesMonitoreo;
import com.museo.util.CondicionesAmbientalesDTO;

import java.util.List;
import java.util.Optional;

public interface CondicionesAmbientalesMonitoreoService {

    CondicionesAmbientalesMonitoreo guardarCondicionesAmbientalesMonitoreo(CondicionesAmbientalesMonitoreo condicionesAmbientalesMonitoreo);

    List<CondicionesAmbientalesMonitoreo> obtenerTodosCondicionesAmbientalesMonitoreo();

    Optional<CondicionesAmbientalesMonitoreo> obtenerPorId(Long id);

    void eliminarCondicionesAmbientalesMonitoreo(Long id);
    
    List<CondicionesAmbientalesDTO> obtenerCondicionesDTO();
}
