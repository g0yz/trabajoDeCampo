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


    public Administrador() {
    }

    public Administrador(Long oidAdministrador, Persona persona) {
        this.oidAdministrador = oidAdministrador;
        this.persona = persona;
    }

    public Long getOidAdministrador() {
        return oidAdministrador;
    }

    public Persona getPersona() {
        return persona;
    }


    public void setOidAdministrador(Long oidAdministrador) {
        this.oidAdministrador = oidAdministrador;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}
