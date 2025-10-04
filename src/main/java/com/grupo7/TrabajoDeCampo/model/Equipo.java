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
    private double montoInvertido;

    @Column(name = "descripcion")
    private String descripcion;

    //verificar esto
    @ManyToOne
    @JoinColumn(name = "idGrupo")
    private Grupo grupo;

}
