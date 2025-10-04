package com.grupo7.TrabajoDeCampo.model;
import jakarta.persistence.*;


@Entity
@Table(name = "PersonalProfesionales")
public class PersonalProfesional extends Persona {


    @ManyToOne
    @JoinColumn(name = "idCargo")
    private Cargo cargo;

    public PersonalProfesional() {
    }

    public PersonalProfesional(String nombre, String apellido) {
        super(nombre, apellido);
    }
}
