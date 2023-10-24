package com.museo.modelo.servicios;

import com.museo.modelo.entidades.Equipos;
import java.util.List;

public interface EquiposService {
	
    List<Equipos> listarEquiposDescendente();
    
    public Equipos crearEquipo(Equipos equipo);

    public Equipos obtenerEquipoPorId(Long id);

    public boolean eliminarEquipo(Long id);
    
    

}
