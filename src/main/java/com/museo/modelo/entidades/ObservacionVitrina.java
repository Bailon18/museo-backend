package com.museo.modelo.entidades;



import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "observacionvitrina")
public class ObservacionVitrina {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

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

	@CreationTimestamp
	private Timestamp fechaRegistro;


    @ManyToOne
    private Observacion observacion;
   
    @Lob
    private String observaciondetalle;

    public ObservacionVitrina() {
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Timestamp getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Timestamp fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Observacion getObservacion() {
		return observacion;
	}

	public void setObservacion(Observacion observacion) {
		this.observacion = observacion;
	}

	public String getObservaciondetalle() {
		return observaciondetalle;
	}

	public void setObservaciondetalle(String observaciondetalle) {
		this.observaciondetalle = observaciondetalle;
	}
	
	

    
}

