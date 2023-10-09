package com.museo.modelo.entidades;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "EquipoTipo")
public class EquipoTipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "Modelo")
    private String modelo;

    @Column(name = "Serie")
    private String serie;

    @ManyToOne
    @JoinColumn(name = "UbicacionID")
    private Ubicacion ubicacion;

    @ManyToOne
    @JoinColumn(name = "AmbienteID")
    private Ambiente ambiente;

    @ManyToOne
    @JoinColumn(name = "NivelPisoID")
    private NivelPiso nivelPiso;

    @ManyToOne
    @JoinColumn(name = "CategoriaID")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "ColeccionID")
    private Coleccion coleccion;

    @ManyToOne
    @JoinColumn(name = "EstadoID")
    private EstadoEquipo estadoEquipo;

    @Column(name = "UnidadMedida")
    private String unidadMedida;

    @Column(name = "RangoMinimo")
    private Double rangoMinimo;

    @Column(name = "RangoMaximo")
    private Double rangoMaximo;

    @Column(name = "FechaCompra")
    private Date fechaCompra;

    @Column(name = "FechaCalibracion")
    private Date fechaCalibracion;

    @Column(name = "FechaRegistro")
    private Date fechaRegistro;

    @Column(name = "Tecnico")
    private String tecnico;

    @Column(name = "Correo")
    private String correo;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "CodigoVitrina", nullable = false)
    private String codigoVitrina;

    @Column(name = "Observacion")
    private String observacion;

    @ManyToOne
    @JoinColumn(name = "TipoEquipoID")
    private TipoEquipo tipoEquipo;
    
    @OneToOne
    @JoinColumn(name = "EquipoID")
    private Equipo equipo;

    // Constructor
    public EquipoTipo() {
    }

    // Getters y setters
 
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public NivelPiso getNivelPiso() {
        return nivelPiso;
    }

    public void setNivelPiso(NivelPiso nivelPiso) {
        this.nivelPiso = nivelPiso;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Coleccion getColeccion() {
        return coleccion;
    }

    public void setColeccion(Coleccion coleccion) {
        this.coleccion = coleccion;
    }

    public EstadoEquipo getEstadoEquipo() {
        return estadoEquipo;
    }

    public void setEstadoEquipo(EstadoEquipo estadoEquipo) {
        this.estadoEquipo = estadoEquipo;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Double getRangoMinimo() {
        return rangoMinimo;
    }

    public void setRangoMinimo(Double rangoMinimo) {
        this.rangoMinimo = rangoMinimo;
    }

    public Double getRangoMaximo() {
        return rangoMaximo;
    }

    public void setRangoMaximo(Double rangoMaximo) {
        this.rangoMaximo = rangoMaximo;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaCalibracion() {
        return fechaCalibracion;
    }

    public void setFechaCalibracion(Date fechaCalibracion) {
        this.fechaCalibracion = fechaCalibracion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoVitrina() {
        return codigoVitrina;
    }

    public void setCodigoVitrina(String codigoVitrina) {
        this.codigoVitrina = codigoVitrina;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public TipoEquipo getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(TipoEquipo tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }
}
