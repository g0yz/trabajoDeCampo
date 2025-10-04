package com.grupo7.TrabajoDeCampo.model;

import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class EquipamientoEInfraestructura {


    public EquipamientoEInfraestructura() {
    }

    public Equipo agregarEquipo(String denominacion, Timestamp fechaIncorporacion, Double montoInvertido, String descripcion, Grupo grupo){
        return  new Equipo(denominacion,fechaIncorporacion,montoInvertido,descripcion,grupo);
    }

}
