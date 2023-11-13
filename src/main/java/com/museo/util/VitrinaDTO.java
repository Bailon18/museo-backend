package com.museo.util;

import java.util.List;

public class VitrinaDTO {
	
    private String codigoVitrina;
    private String ambiente;
    private String nivelpiso;
    private String estadoVitrina;
    private List<EquipoTipoDTO> equipoTipos;
    
   
    public VitrinaDTO() {

	}

	public VitrinaDTO(String codigoVitrina, String ambiente, String nivelpiso, String estadoVitrina, List<EquipoTipoDTO> equipoTipos) {
        this.codigoVitrina = codigoVitrina;
        this.ambiente = ambiente;
        this.nivelpiso = nivelpiso;
        this.estadoVitrina = estadoVitrina;
        this.equipoTipos = equipoTipos;
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

	public String getNivelpiso() {
		return nivelpiso;
	}

	public void setNivelpiso(String nivelpiso) {
		this.nivelpiso = nivelpiso;
	}

	public String getEstadoVitrina() {
		return estadoVitrina;
	}

	public void setEstadoVitrina(String estadoVitrina) {
		this.estadoVitrina = estadoVitrina;
	}

	public List<EquipoTipoDTO> getEquipoTipos() {
		return equipoTipos;
	}

	public void setEquipoTipos(List<EquipoTipoDTO> equipoTipos) {
		this.equipoTipos = equipoTipos;
	}

    
    
    
}