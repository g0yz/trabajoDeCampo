package com.grupo7.TrabajoDeCampo.model;
import jakarta.persistence.*;

import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name = "Equipos")
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEquipo")
    private long idEquipo;

    @Column(name = "denominacion")
    private String denominacion;

    @Column(name= "fechaIncorporacion")
    private Timestamp fechaIncorporacion;

    @Column(name = "montoInvertido")
    private Double montoInvertido;

    @Column(name = "descripcion")
    private String descripcion;

    //verificar esto
    @ManyToOne
    @JoinColumn(name = "idGrupo")
    private Grupo grupo;


    public Equipo() {
    }

    public Equipo(String denominacion, Timestamp fechaIncorporacion, Double montoInvertido, String descripcion, Grupo grupo){
        this.denominacion = denominacion;
        this.fechaIncorporacion = fechaIncorporacion;
        this.montoInvertido = montoInvertido;
        this.descripcion = descripcion;
        this.grupo = grupo;
    }

    //GETTERS
    public long getIdEquipo() {
        return idEquipo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public Timestamp getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public Double getMontoInvertido() {
        return montoInvertido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    //SETTERS
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMontoInvertido(Double montoInvertido) {
        this.montoInvertido = montoInvertido;
    }

    public void setFechaIncorporacion(Timestamp fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public void setIdEquipo(long idEquipo) {
        this.idEquipo = idEquipo;
    }
}
