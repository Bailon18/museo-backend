package com.museo.modelo.entidades;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "equipos")
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CodigoEquipo", nullable = false)
    private String codigoEquipo;
	
    @OneToMany(mappedBy = "equipo")
    private List<EquipoTipo> equiposTipos;

   
	public Equipo() {

	}

	public Equipo(Long id, String codigoEquipo) {
		this.id = id;
		this.codigoEquipo = codigoEquipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoEquipo() {
		return codigoEquipo;
	}

	public void setCodigoEquipo(String codigoEquipo) {
		this.codigoEquipo = codigoEquipo;
	}

	public List<EquipoTipo> getEquiposTipos() {
		return equiposTipos;
	}

	public void setEquiposTipos(List<EquipoTipo> equiposTipos) {
		this.equiposTipos = equiposTipos;
	}
	
	
    
    
}
