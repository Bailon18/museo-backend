package com.museo.modelo.entidades;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "vitrinas")
public class Vitrinas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String codigoVitrina;

	private String responsable;

	private String correo;

	private String estadoVitrina;

	private double largo;

	private double ancho;

	private double alto;

	private String descripcion;

	private Date fechaRegistro;

	@ManyToOne
	private Ubicacion ubicacion;

	@ManyToOne
	private Ambiente ambiente;

	@ManyToOne
	private NivelPiso nivelPiso;

	@ManyToOne
	private Equipos equipo;

    @OneToMany
    private List<BienesPatrimoniales> bienesPatrimoniales;

	public Vitrinas() {

	}

	public long getId() {
		return id;
	}

	public void setId(long iD) {
		this.id = iD;
	}

	public String getCodigoVitrina() {
		return codigoVitrina;
	}

	public void setCodigoVitrina(String codigoVitrina) {
		this.codigoVitrina = codigoVitrina;
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

	public String getEstadoVitrina() {
		return estadoVitrina;
	}

	public void setEstadoVitrina(String estadoVitrina) {
		this.estadoVitrina = estadoVitrina;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
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

	public Equipos getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipos equipo) {
		this.equipo = equipo;
	}

	public List<BienesPatrimoniales> getBienesPatrimoniales() {
		return bienesPatrimoniales;
	}

	public void setBienesPatrimoniales(List<BienesPatrimoniales> bienesPatrimoniales) {
		this.bienesPatrimoniales = bienesPatrimoniales;
	}


}
