package com.museo.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tiposanomalias")
public class TipoAnomalias {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String Descripcion;

    @ManyToOne
    private Anomalia anomalia;

	public TipoAnomalias() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Anomalia getAnomalia() {
		return anomalia;
	}

	public void setAnomalia(Anomalia anomalia) {
		this.anomalia = anomalia;
	}

	
    
}
