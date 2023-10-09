package com.museo.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "gravedad")
public class Gravedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GravedadId")
    private long gravedadId;

    @Column(name = "Descripcion", nullable = false)
    private String descripcion;

    // Constructor
    public Gravedad() {
    }

    // Getters y setters
    public long getGravedadId() {
        return gravedadId;
    }

    public void setGravedadId(long gravedadId) {
        this.gravedadId = gravedadId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
