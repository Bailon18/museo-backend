package com.museo.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.security.Timestamp;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "condicionesambientalesmonitoreo")
public class CondicionesAmbientalesMonitoreo {

	@Id
	private Long id;

	private String codigo_condicion;

	@CreationTimestamp
	private Timestamp fechaRegistro;

	private double temperatura;

	private double humedad;

	private double luminosidad;

	private String observacionHumedad;

	private String observacionTemperatura;

	private String observacionLuminosidad;

	@ManyToOne
	private Vitrinas vitrina;

	public CondicionesAmbientalesMonitoreo() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo_condicion() {
		return codigo_condicion;
	}

	public void setCodigo_condicion(String codigo_condicion) {
		this.codigo_condicion = codigo_condicion;
	}

	public Timestamp getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Timestamp fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getHumedad() {
		return humedad;
	}

	public void setHumedad(double humedad) {
		this.humedad = humedad;
	}

	public double getLuminosidad() {
		return luminosidad;
	}

	public void setLuminosidad(double luminosidad) {
		this.luminosidad = luminosidad;
	}

	public String getObservacionHumedad() {
		return observacionHumedad;
	}

	public void setObservacionHumedad(String observacionHumedad) {
		this.observacionHumedad = observacionHumedad;
	}

	public String getObservacionTemperatura() {
		return observacionTemperatura;
	}

	public void setObservacionTemperatura(String observacionTemperatura) {
		this.observacionTemperatura = observacionTemperatura;
	}

	public String getObservacionLuminosidad() {
		return observacionLuminosidad;
	}

	public void setObservacionLuminosidad(String observacionLuminosidad) {
		this.observacionLuminosidad = observacionLuminosidad;
	}

	public Vitrinas getVitrina() {
		return vitrina;
	}

	public void setVitrina(Vitrinas vitrina) {
		this.vitrina = vitrina;
	}

}
