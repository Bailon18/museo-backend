package com.museo.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "aprobacion")
public class Aprobacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String estado;

    // Constructor
    public Aprobacion() {
    }

    // Getters y setters
    public long getId() {
        return id;
    }

    public void setId(long aprobacionId) {
        this.id = aprobacionId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

