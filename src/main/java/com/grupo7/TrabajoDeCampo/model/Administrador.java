package com.grupo7.TrabajoDeCampo.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Administrador")
public class Administrador {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="oidAdministrador")
    private Long oidAdministrador;

    @OneToOne
    @JoinColumn(name = "oidPersona", referencedColumnName = "oidPersona")
    private Persona persona;

}
