package com.museo.modelo.entidades;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "vitrinas")
public class Vitrinas {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    @Column(name = "CodigoVitrina")
    private String codigoVitrina;

    @Column(name = "Responsable")
    private String responsable;

    @Column(name = "Correo")
    private String correo;

    @Column(name = "EstadoVitrina")
    private String estadoVitrina;

    @Column(name = "Largo")
    private double largo;

    @Column(name = "Ancho")
    private double ancho;

    @Column(name = "Alto")
    private double alto;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "FechaRegistro")
    private Date fechaRegistro;

    @ManyToOne
    @JoinColumn(name = "UbicacionID")
    private Ubicacion ubicacion;

    @ManyToOne
    @JoinColumn(name = "AmbienteID")
    private Ambiente ambiente;

    @ManyToOne
    @JoinColumn(name = "NivelPisoID")
    private NivelPiso nivelPiso;

    @ManyToOne
    @JoinColumn(name = "EquipoID")
    private Equipos equipo;

    @ManyToOne
    @JoinColumn(name = "CodigoPatrimonialID")
    private BienesPatrimoniales bienPatrimonial;

	public Vitrinas() {

	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
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

	public BienesPatrimoniales getBienPatrimonial() {
		return bienPatrimonial;
	}

	public void setBienPatrimonial(BienesPatrimoniales bienPatrimonial) {
		this.bienPatrimonial = bienPatrimonial;
	}


}
