package com.museo.modelo.servicios;

import java.util.List;

import com.museo.modelo.entidades.Vitrinas;
import com.museo.util.VitrinaDTO;

public interface VitrinasService {
	
    List<Vitrinas> obtenerTodasLasVitrinas();
    Vitrinas obtenerVitrinaPorId(Long id);
    Vitrinas guardarVitrina(Vitrinas vitrina);
    boolean eliminarVitrina(Long id);
    VitrinaDTO obtenerDatosPorCodigoVitrina(String codigoVitrina);
}
