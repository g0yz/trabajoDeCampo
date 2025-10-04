package com.grupo7.TrabajoDeCampo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "IntegranteConsejoEducativos")
public class IntegranteConsejoEducativo extends Persona{

    @ManyToOne
    @JoinColumn(name = "idCargo")
    private Cargo cargo;
}
