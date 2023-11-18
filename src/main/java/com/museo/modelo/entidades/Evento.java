package com.museo.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import java.util.Date;

@Entity
@Table(name = "eventos")
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String codigoEventos;

	@ManyToOne
	private TipoEvento tipoEvento;

	private Date fechaEvento;

	private Date fechaRegistro;

	@ManyToOne
	private Pais pais;

	private String lugar;

	private String departamento;	
	
	private String prioridad;

	

	@ManyToOne
	private BienesPatrimoniales patrimonio;

	private String observacion;

	public Evento() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoEventos() {
		return codigoEventos;
	}

	public void setCodigoEventos(String codigoEventos) {
		this.codigoEventos = codigoEventos;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Date getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public BienesPatrimoniales getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(BienesPatrimoniales patrimonio) {
		this.patrimonio = patrimonio;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	
}
