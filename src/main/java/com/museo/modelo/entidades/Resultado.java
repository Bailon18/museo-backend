package com.museo.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "resultado")
public class Resultado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ResultadoId")
    private long resultadoId;

    @Column(name = "Descripcion", nullable = false)
    private String descripcion;

    // Constructor
    public Resultado() {
    }

    // Getters y setters
    public long getResultadoId() {
        return resultadoId;
    }

    public void setResultadoId(long resultadoId) {
        this.resultadoId = resultadoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
