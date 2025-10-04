package com.grupo7.TrabajoDeCampo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Personal_tecnico_administrativo_y_de_apoyos")

public class PersonalTecnicoAdministrativoYDeApoyo extends Persona {


    public PersonalTecnicoAdministrativoYDeApoyo() {
    }

    public PersonalTecnicoAdministrativoYDeApoyo(String nombre, String apellido, String horasSemanales) {
        super(nombre, apellido, horasSemanales);
    }
}
