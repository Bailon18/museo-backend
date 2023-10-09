package com.museo.modelo.entidades;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "tiposequipo")
public class TipoEquipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TipoEquipoID")
    private long tipoEquipoID;

    @Column(name = "Descripcion", unique = true, nullable = false)
    private String descripcion;
    
    @OneToMany(mappedBy = "tipoEquipo")
    private List<EquipoTipo> equiposTipos;

    // Constructor
    public TipoEquipo() {
    }

    // Getters y setters
    public long getTipoEquipoID() {
        return tipoEquipoID;
    }

    public void setTipoEquipoID(long tipoEquipoID) {
        this.tipoEquipoID = tipoEquipoID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
