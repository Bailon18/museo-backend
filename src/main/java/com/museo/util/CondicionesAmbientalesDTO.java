package com.museo.util;

import java.util.Date;

public class CondicionesAmbientalesDTO {
	
    private Long id;
    private String codigoCondicion;
    private Date fechaRegistro;
    private String codigoVitrina;
    private String ambiente;
    private String nivelPiso;
    private String estadoVitrina;
    private String humedadAlerta;
    private String temperaturaAlerta;
    private String luminosidadAlerta;
    private String equipoTiposTem;
    private String equipoTiposHum;
    private String equipoTiposLum;


    public CondicionesAmbientalesDTO() {
    }

  
    public CondicionesAmbientalesDTO(Long id, String codigoCondicion, Date fechaRegistro, String codigoVitrina,
                                     String ambiente, String nivelPiso, String estadoVitrina,
                                     String humedadAlerta, String temperaturaAlerta, String luminosidadAlerta,
                                     String equipoTiposTem, String equipoTiposHum, String equipoTiposLum) {
        this.id = id;
        this.codigoCondicion = codigoCondicion;
        this.fechaRegistro = fechaRegistro;
        this.codigoVitrina = codigoVitrina;
        this.ambiente = ambiente;
        this.nivelPiso = nivelPiso;
        this.estadoVitrina = estadoVitrina;
        this.humedadAlerta = humedadAlerta;
        this.temperaturaAlerta = temperaturaAlerta;
        this.luminosidadAlerta = luminosidadAlerta;
        this.equipoTiposTem = equipoTiposTem;
        this.equipoTiposHum = equipoTiposHum;
        this.equipoTiposLum = equipoTiposLum;
    }


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCodigoCondicion() {
		return codigoCondicion;
	}


	public void setCodigoCondicion(String codigoCondicion) {
		this.codigoCondicion = codigoCondicion;
	}


	public Date getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	public String getCodigoVitrina() {
		return codigoVitrina;
	}


	public void setCodigoVitrina(String codigoVitrina) {
		this.codigoVitrina = codigoVitrina;
	}


	public String getAmbiente() {
		return ambiente;
	}


	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}


	public String getNivelPiso() {
		return nivelPiso;
	}


	public void setNivelPiso(String nivelPiso) {
		this.nivelPiso = nivelPiso;
	}


	public String getEstadoVitrina() {
		return estadoVitrina;
	}


	public void setEstadoVitrina(String estadoVitrina) {
		this.estadoVitrina = estadoVitrina;
	}


	public String getHumedadAlerta() {
		return humedadAlerta;
	}


	public void setHumedadAlerta(String humedadAlerta) {
		this.humedadAlerta = humedadAlerta;
	}


	public String getTemperaturaAlerta() {
		return temperaturaAlerta;
	}


	public void setTemperaturaAlerta(String temperaturaAlerta) {
		this.temperaturaAlerta = temperaturaAlerta;
	}


	public String getLuminosidadAlerta() {
		return luminosidadAlerta;
	}


	public void setLuminosidadAlerta(String luminosidadAlerta) {
		this.luminosidadAlerta = luminosidadAlerta;
	}


	public String getEquipoTiposTem() {
		return equipoTiposTem;
	}


	public void setEquipoTiposTem(String equipoTiposTem) {
		this.equipoTiposTem = equipoTiposTem;
	}


	public String getEquipoTiposHum() {
		return equipoTiposHum;
	}


	public void setEquipoTiposHum(String equipoTiposHum) {
		this.equipoTiposHum = equipoTiposHum;
	}


	public String getEquipoTiposLum() {
		return equipoTiposLum;
	}


	public void setEquipoTiposLum(String equipoTiposLum) {
		this.equipoTiposLum = equipoTiposLum;
	}
    
    
}

