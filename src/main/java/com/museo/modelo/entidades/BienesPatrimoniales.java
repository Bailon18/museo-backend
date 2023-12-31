package com.museo.modelo.entidades;

import jakarta.persistence.*;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "bienespatrimoniales")
public class BienesPatrimoniales {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String codigoBienPatrimonial;

	private String rni;

	private String tipoMaterial;

	private String denominacion;

	private String tematica;

	private String descripcion;

	private String detalleConservacion;

	private String tratamiento;

	private String responsable;

	private String correo;

	@CreationTimestamp
	private Timestamp fechaRegistro;

	@ManyToOne
	private Cultura cultura;
	
	@ManyToOne
	private Ubicacion ubicacion;
	
	@ManyToOne
	private Categoria categoria;
	
	@ManyToOne
	private Coleccion coleccion;
	
	@ManyToOne
	private NivelPiso nivelpiso;
	
	@ManyToOne
	private EstadoConservacion estadoConservacion;
	
    @ManyToOne
    private Vitrinas vitrina;
	
	public BienesPatrimoniales() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodigoBienPatrimonial() {
		return codigoBienPatrimonial;
	}

	public void setCodigoBienPatrimonial(String codigoBienPatrimonial) {
		this.codigoBienPatrimonial = codigoBienPatrimonial;
	}

	public String getRni() {
		return rni;
	}

	public void setRni(String rni) {
		this.rni = rni;
	}

	public String getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDetalleConservacion() {
		return detalleConservacion;
	}

	public void setDetalleConservacion(String detalleConservacion) {
		this.detalleConservacion = detalleConservacion;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Timestamp getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Timestamp fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Cultura getCultura() {
		return cultura;
	}

	public void setCultura(Cultura cultura) {
		this.cultura = cultura;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
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

	public EstadoConservacion getEstadoConservacion() {
		return estadoConservacion;
	}

	public void setEstadoConservacion(EstadoConservacion estadoConservacion) {
		this.estadoConservacion = estadoConservacion;
	}

	public NivelPiso getNivelpiso() {
		return nivelpiso;
	}

	public void setNivelpiso(NivelPiso nivelpiso) {
		this.nivelpiso = nivelpiso;
	}

	@Override
	public String toString() {
		return "BienesPatrimoniales [id=" + id + ", codigoBienPatrimonial=" + codigoBienPatrimonial + ", rni=" + rni
				+ ", tipoMaterial=" + tipoMaterial + ", denominacion=" + denominacion + ", tematica=" + tematica
				+ ", descripcion=" + descripcion + ", detalleConservacion=" + detalleConservacion + ", tratamiento="
				+ tratamiento + ", responsable=" + responsable + ", correo=" + correo + ", fechaRegistro="
				+ fechaRegistro + ", cultura=" + cultura + ", ubicacion=" + ubicacion + ", categoria=" + categoria
				+ ", coleccion=" + coleccion + ", nivelpiso=" + nivelpiso + ", estadoConservacion=" + estadoConservacion
				+ ", vitrina=" + vitrina + "]";
	}


	
	

}
