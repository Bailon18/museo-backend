package com.museo.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "tipoevento")
public class TipoEvento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TipoEventoId")
    private long tipoEventoId;

    @Column(name = "Descripcion", nullable = false)
    private String descripcion;

    // Constructor
    public TipoEvento() {
    }

    // Getters y setters
    public long getTipoEventoId() {
        return tipoEventoId;
    }

    public void setTipoEventoId(long tipoEventoId) {
        this.tipoEventoId = tipoEventoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
