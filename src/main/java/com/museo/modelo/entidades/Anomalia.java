package com.museo.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "anomalias")
public class Anomalia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Descripcion")
    private String descripcion;

    // Constructor
    public Anomalia() {
    }

    // Getters y setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
