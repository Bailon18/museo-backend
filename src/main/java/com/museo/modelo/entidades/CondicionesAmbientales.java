package com.museo.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "condicionesAmbientales")
public class CondicionesAmbientales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String codigoCondicionesambientales;
    
    public CondicionesAmbientales() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigoCondicionesambientales() {
        return codigoCondicionesambientales;
    }

    public void setCodigoCondicionesambientales(String codigoCondicionesambientales) {
        this.codigoCondicionesambientales = codigoCondicionesambientales;
    }
}
