package com.museo.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "prioridad")
public class Prioridad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "Descripcion", nullable = false)
    private String descripcion;

    public Prioridad() {
    }

    public long getId() {
        return id;
    }

    public void setId(long prioridadId) {
        this.id = prioridadId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

