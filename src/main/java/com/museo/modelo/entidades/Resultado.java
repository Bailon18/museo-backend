package com.museo.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "resultado")
public class Resultado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "Descripcion", nullable = false)
    private String descripcion;

    public Resultado() {
    }

    public long getId() {
        return id;
    }

    public void setId(long resultadoId) {
        this.id = resultadoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
