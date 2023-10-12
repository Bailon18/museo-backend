package com.museo.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "gravedad")
public class Gravedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    
    private String descripcion;

    // Constructor
    public Gravedad() {
    }

    // Getters y setters
    public long getId() {
        return id;
    }

    public void setId(long gravedadId) {
        this.id = gravedadId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
