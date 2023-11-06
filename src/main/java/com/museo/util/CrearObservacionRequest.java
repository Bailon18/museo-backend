package com.museo.util;

import java.util.List;

import com.museo.modelo.entidades.ObservacionBienPatrimonial;
import com.museo.modelo.entidades.ObservacionVitrina;

public class CrearObservacionRequest {
	
	private ObservacionVitrina observacionVitrina;
	private List<ObservacionBienPatrimonial> listaObservacionBienPatrimonial;

	public CrearObservacionRequest() {
	}

	public ObservacionVitrina getObservacionVitrina() {
		return observacionVitrina;
	}

	public void setObservacionVitrina(ObservacionVitrina observacionVitrina) {
		this.observacionVitrina = observacionVitrina;
	}

	public List<ObservacionBienPatrimonial> getListaObservacionBienPatrimonial() {
		return listaObservacionBienPatrimonial;
	}

	public void setListaObservacionBienPatrimonial(List<ObservacionBienPatrimonial> listaObservacionBienPatrimonial) {
		this.listaObservacionBienPatrimonial = listaObservacionBienPatrimonial;
	}

}
