package com.museo.util;

import java.util.List;

import com.museo.modelo.entidades.ObservacionBienPatrimonial;
import com.museo.modelo.entidades.ObservacionVitrina;

public class ObservacionDetalleDTO {
	
    private List<ObservacionBienPatrimonial> listaObservacionBP;
    private ObservacionVitrina observacionVitrina;

    // Constructor
    public ObservacionDetalleDTO(List<ObservacionBienPatrimonial> listaObservacionBP,
    							ObservacionVitrina observacionVitrina) {
        this.listaObservacionBP = listaObservacionBP;
        this.observacionVitrina = observacionVitrina;
    }

	public List<ObservacionBienPatrimonial> getListaObservacionBP() {
		return listaObservacionBP;
	}

	public void setListaObservacionBP(List<ObservacionBienPatrimonial> listaObservacionBP) {
		this.listaObservacionBP = listaObservacionBP;
	}

	public ObservacionVitrina getObservacionVitrina() {
		return observacionVitrina;
	}

	public void setObservacionVitrina(ObservacionVitrina observacionVitrina) {
		this.observacionVitrina = observacionVitrina;
	}

    
}
