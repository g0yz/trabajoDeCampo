package com.grupo7.TrabajoDeCampo.model;

import jakarta.persistence.Column;
import org.springframework.stereotype.Service;

@Service
public class CreatorGrupo {

    public CreatorGrupo() {
    }

    public Grupo agregarGrupo(String nombreGrupo, String sigla, String email, String organigrama, String objetivoYDesarrollo){
        return new Grupo(nombreGrupo, sigla, email, organigrama, objetivoYDesarrollo);
    }




}
