package com.museo.modelo.servicios;

import java.util.List;

import com.museo.modelo.entidades.Vitrinas;

public interface VitrinasService {
	
    List<Vitrinas> obtenerTodasLasVitrinas();
    Vitrinas obtenerVitrinaPorId(Long id);
    Vitrinas guardarVitrina(Vitrinas vitrina);
    void eliminarVitrina(Long id);
}
