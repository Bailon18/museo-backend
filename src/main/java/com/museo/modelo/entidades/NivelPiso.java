package com.museo.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "nivelespiso")
public class NivelPiso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Nombre")
    private String nombre;

    // Constructor
    public NivelPiso() {
    }

    // Getters y setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
