package com.museo.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "estadosconservacion")
public class EstadoConservacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Estado")
    private String estado;

    // Constructor
    public EstadoConservacion() {
    }

    // Getters y setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

