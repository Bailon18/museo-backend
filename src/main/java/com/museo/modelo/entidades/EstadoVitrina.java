package com.museo.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "estadosvitrina")
public class EstadoVitrina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String estado;

    // Constructor
    public EstadoVitrina() {
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
