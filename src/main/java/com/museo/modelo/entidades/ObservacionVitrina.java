package com.museo.modelo.entidades;



import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "observacionvitrina")
public class ObservacionVitrina {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    private String observacionVitrinaId;

    @ManyToOne
    private Vitrinas vitrina;

    @ManyToOne
    private Anomalia anomalia;

    @ManyToOne
    private TipoAnomalias tipoAnomalia;

    @ManyToOne
    private Gravedad gravedad;

    @ManyToOne
    private Resultado resultado;

    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;

    @ManyToOne
    private Observacion observacion;

    public ObservacionVitrina() {
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getObservacionVitrinaId() {
		return observacionVitrinaId;
	}

	public void setObservacionVitrinaId(String observacionVitrinaId) {
		this.observacionVitrinaId = observacionVitrinaId;
	}

	public Vitrinas getVitrina() {
		return vitrina;
	}

	public void setVitrina(Vitrinas vitrina) {
		this.vitrina = vitrina;
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
