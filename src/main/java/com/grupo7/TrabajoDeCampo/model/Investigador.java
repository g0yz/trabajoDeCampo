package com.grupo7.TrabajoDeCampo.model;
import jakarta.persistence.*;

@Entity
@Table(name="Investigadores")
public class Investigador extends Persona{

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name="idInvestigador")
    //private Long idInvestigador;

    @Column(name="categoriaUTN")
    private String categoriaUTN;

    @Column(name="programaDeIncentivos")
    private String programaDeIncentivos;

    @Column(name = "dedicacion")
    private String dedicacion;

    //@ManyToOne
    //@JoinColumn(name = "idPersona", referencedColumnName = "idPersona")
    //private Persona persona;


    //CONSTRUCTORES

    public Investigador() {
    }

    public Investigador(String nombre, String apellido, String horasSemanales) {
        super(nombre, apellido, horasSemanales);
    }

    //GETTERS
    public String getDedicacion(){
        return dedicacion;
    }

    public String getCategoriaUTN() {
        return categoriaUTN;
    }

    public String getProgramaDeIncentivos() {
        return programaDeIncentivos;
    }


    //SETTERS


    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }

    public void setProgramaDeIncentivos(String programaDeIncentivos) {
        this.programaDeIncentivos = programaDeIncentivos;
    }

    public void setCategoriaUTN(String categoriaUTN) {
        this.categoriaUTN = categoriaUTN;
    }
}

