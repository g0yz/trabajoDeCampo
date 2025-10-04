package com.grupo7.TrabajoDeCampo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "TipoBecarios")
public class TipoBecario {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="idTipoBecario")
        private long idTipoBecario;

        @Column(name = "nombre")
        private String nombre;

        //CONSTRUCTORES
    public TipoBecario(){
    }

    public TipoBecario(long idTipoBecario) {
        this.idTipoBecario = idTipoBecario;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
