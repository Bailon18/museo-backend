package com.museo.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;


import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;


@Entity
@Table(name = "observacionbienpatrimonial")
public class ObservacionBienPatrimonial {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String observacionBienPatrimonialId;

    @ManyToOne
    private BienesPatrimoniales bienPatrimonial;

    @ManyToOne
    private Anomalia anomalia;

    @ManyToOne
    private TipoAnomalias tipoAnomalia;

    @ManyToOne
    private Gravedad gravedad;

    @ManyToOne
    private Resultado resultado;

    @ManyToOne
    private Aprobacion aprobacion;

    //@Temporal(TemporalType.DATE)
    private Date fechaRegistro;

    @ManyToOne
    private Observacion observacion;

    public ObservacionBienPatrimonial() {
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getObservacionBienPatrimonialId() {
		return observacionBienPatrimonialId;
	}

	public void setObservacionBienPatrimonialId(String observacionBienPatrimonialId) {
		this.observacionBienPatrimonialId = observacionBienPatrimonialId;
	}

	public BienesPatrimoniales getBienPatrimonial() {
		return bienPatrimonial;
	}

	public void setBienPatrimonial(BienesPatrimoniales bienPatrimonial) {
		this.bienPatrimonial = bienPatrimonial;
	}

	public Anomalia getAnomalia() {
		return anomalia;
	}

	public void setAnomalia(Anomalia anomalia) {
		this.anomalia = anomalia;
	}

	public TipoAnomalias getTipoAnomalia() {
		return tipoAnomalia;
	}

	public void setTipoAnomalia(TipoAnomalias tipoAnomalia) {
		this.tipoAnomalia = tipoAnomalia;
	}

	public Gravedad getGravedad() {
		return gravedad;
	}

	public void setGravedad(Gravedad gravedad) {
		this.gravedad = gravedad;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	public Aprobacion getAprobacion() {
		return aprobacion;
	}

	public void setAprobacion(Aprobacion aprobacion) {
		this.aprobacion = aprobacion;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Observacion getObservacion() {
		return observacion;
	}

	public void setObservacion(Observacion observacion) {
		this.observacion = observacion;
	}
    
    

}
