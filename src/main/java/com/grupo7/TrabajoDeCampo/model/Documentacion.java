package com.grupo7.TrabajoDeCampo.model;

import org.springframework.stereotype.Service;

@Service
public class Documentacion {

    public Documentacion() {
    }

    public Documento agregarDocumento(String titulo, String autores, String editorial, String anio, Grupo grupo){
        return new Documento(titulo, autores, editorial, anio, grupo);
    }



}
