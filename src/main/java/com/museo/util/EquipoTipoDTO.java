package com.museo.util;

public class EquipoTipoDTO {

	private String codigo_equipo_tipo;
	private String unidad_medida;

	
	
	
	public EquipoTipoDTO() {
		super();
	}

	public EquipoTipoDTO(String codigo_equipo_tipo, String unidad_medida) {
		this.codigo_equipo_tipo = codigo_equipo_tipo;
		this.unidad_medida = unidad_medida;
	}

	public String getCodigo_equipo_tipo() {
		return codigo_equipo_tipo;
	}

	public void setCodigo_equipo_tipo(String codigo_equipo_tipo) {
		this.codigo_equipo_tipo = codigo_equipo_tipo;
	}

	public String getUnidad_medida() {
		return unidad_medida;
	}

	public void setUnidad_medida(String unidad_medida) {
		this.unidad_medida = unidad_medida;
	}

}

