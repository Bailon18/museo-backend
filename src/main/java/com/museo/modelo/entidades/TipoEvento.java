package com.museo.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "tipoevento")
public class TipoEvento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String descripcion;

    // Constructor
    public TipoEvento() {
    }

    // Getters y setters
    public long getId() {
        return id;
    }

    public void setId(long tipoEventoId) {
        this.id = tipoEventoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
