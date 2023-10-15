package com.museo.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "equipos")
public class Equipos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigoEquipo;
	
	public Equipos() {

	}

	public Equipos(Long id, String codigoEquipo) {
		this.id = id;
		this.codigoEquipo = codigoEquipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoEquipo() {
		return codigoEquipo;
	}

	public void setCodigoEquipo(String codigoEquipo) {
		this.codigoEquipo = codigoEquipo;
	}
}