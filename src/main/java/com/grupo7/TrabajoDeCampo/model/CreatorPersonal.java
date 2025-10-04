package com.grupo7.TrabajoDeCampo.model;

import org.springframework.stereotype.Service;

@Service
public class CreatorPersonal {

    public CreatorPersonal() {
    }

    public Persona agregarPersona(String nombre, String apellido, String horasSemanales) {
        return  new Persona(nombre, apellido, horasSemanales);
    }

}
