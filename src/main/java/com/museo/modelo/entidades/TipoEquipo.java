package com.museo.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "tiposequipo")
public class TipoEquipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Descripcion", unique = true, nullable = false)
    private String descripcion;
    

    // Constructor
    public TipoEquipo() {
    }

    // Getters y setters
    public long getId() {
        return id;
    }

    public void setId(long tipoEquipoID) {
        this.id = tipoEquipoID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
