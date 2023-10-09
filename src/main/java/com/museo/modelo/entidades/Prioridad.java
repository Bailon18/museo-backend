package com.museo.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "prioridad")
public class Prioridad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PrioridadId")
    private long prioridadId;

    @Column(name = "Descripcion", nullable = false)
    private String descripcion;

    // Constructor
    public Prioridad() {
    }

    // Getters y setters
    public long getPrioridadId() {
        return prioridadId;
    }

    public void setPrioridadId(long prioridadId) {
        this.prioridadId = prioridadId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

