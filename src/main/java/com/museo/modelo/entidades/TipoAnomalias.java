package com.museo.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "tiposanomalias")
public class TipoAnomalias {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String Descripcion;

    @ManyToOne
    @JoinColumn(name = "AnomaliaId")
    private Anomalia anomalia;

	public TipoAnomalias() {
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
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
