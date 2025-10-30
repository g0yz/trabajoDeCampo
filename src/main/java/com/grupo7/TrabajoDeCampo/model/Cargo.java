package com.grupo7.TrabajoDeCampo.model;

import jakarta.persistence.*;

@Entity
@Table(name ="Cargo")
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "oidCargo")
    private Long oidCargo;

    @Column (name = "descripcion")
    private String descripcion;


    public Cargo() {
    }

    public Cargo(Long oidCargo, String descripcion) {
        this.oidCargo = oidCargo;
        this.descripcion = descripcion;
    }


    public Long getOidCargo() {
        return oidCargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setOidCargo(Long oidCargo) {
        this.oidCargo = oidCargo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
