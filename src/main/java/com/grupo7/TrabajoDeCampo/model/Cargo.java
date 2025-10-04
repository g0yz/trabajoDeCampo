package com.grupo7.TrabajoDeCampo.model;
import jakarta.persistence.*;

@Entity
@Table(name="Cargos")
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCargo")
    private long idCargo;

    @Column(name = "descripcion")
    private String descripcion;



    //CONSTRUCTORES
    public Cargo(){
    }
    public Cargo(String descripcion) {
        this.descripcion = descripcion;
    }

    //GETTERS
    public long getIdCargo() {
        return idCargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //SETTERS
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIdCargo(long idCargo) {
        this.idCargo = idCargo;
    }
}
