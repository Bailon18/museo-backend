package com.museo.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "aprobacion")
public class Aprobacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AprobacionId")
    private long aprobacionId;

    @Column(name = "Estado", nullable = false)
    private String estado;

    // Constructor
    public Aprobacion() {
    }

    // Getters y setters
    public long getAprobacionId() {
        return aprobacionId;
    }

    public void setAprobacionId(long aprobacionId) {
        this.aprobacionId = aprobacionId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

