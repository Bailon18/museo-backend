package com.museo.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "observaciones")
public class Observacion {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String codigoObservacion;

	public Observacion() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodigoObservacion() {
		return codigoObservacion;
	}

	public void setCodigoObservacion(String codigoObservacion) {
		this.codigoObservacion = codigoObservacion;
	}

	
    
}
