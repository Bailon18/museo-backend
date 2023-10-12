package com.museo.modelo.entidades;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "EquipoTipo")
public class EquipoTipo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String modelo;

	private String serie;

	private String unidadMedida;

	private Double rangoMinimo;

	private Double rangoMaximo;

	private Date fechaCompra;

	private Date fechaCalibracion;

	private Date fechaRegistro;

	private String tecnico;

	private String correo;

	private String descripcion;

	private String observacion;

	@ManyToOne
	private Ubicacion ubicacion;

	@ManyToOne
	private Ambiente ambiente;

	@ManyToOne
	private NivelPiso nivelPiso;

	@ManyToOne
	private Categoria categoria;

	@ManyToOne
	private Coleccion coleccion;

	@ManyToOne
	private EstadoEquipo estadoEquipo;

	@ManyToOne
	private TipoEquipo tipoEquipo;

	@OneToOne
	private Equipos equipos;

	// Constructor
	public EquipoTipo() {
	}

	// Getters y setters

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Ambiente getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(Ambiente ambiente) {
		this.ambiente = ambiente;
	}

	public NivelPiso getNivelPiso() {
		return nivelPiso;
	}

	public void setNivelPiso(NivelPiso nivelPiso) {
		this.nivelPiso = nivelPiso;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Coleccion getColeccion() {
		return coleccion;
	}

	public void setColeccion(Coleccion coleccion) {
		this.coleccion = coleccion;
	}

	public EstadoEquipo getEstadoEquipo() {
		return estadoEquipo;
	}

	public void setEstadoEquipo(EstadoEquipo estadoEquipo) {
		this.estadoEquipo = estadoEquipo;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public Double getRangoMinimo() {
		return rangoMinimo;
	}

	public void setRangoMinimo(Double rangoMinimo) {
		this.rangoMinimo = rangoMinimo;
	}

	public Double getRangoMaximo() {
		return rangoMaximo;
	}

	public void setRangoMaximo(Double rangoMaximo) {
		this.rangoMaximo = rangoMaximo;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Date getFechaCalibracion() {
		return fechaCalibracion;
	}

	public void setFechaCalibracion(Date fechaCalibracion) {
		this.fechaCalibracion = fechaCalibracion;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public TipoEquipo getTipoEquipo() {
		return tipoEquipo;
	}

	public void setTipoEquipo(TipoEquipo tipoEquipo) {
		this.tipoEquipo = tipoEquipo;
	}
}
