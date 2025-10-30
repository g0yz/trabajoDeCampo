package com.grupo7.TrabajoDeCampo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Investigador")
public class Investigador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="oidInverstigador")
    private Long oidInverstigador;

    @JoinColumn(name = "categoriaUTN")
    private String categoriaUTN;

    @JoinColumn(name = "programaDeIncentivos")
    private String programaDeIncentivos;

    @JoinColumn(name = "dedicacion")
    private String dedicacion;

    @JoinColumn(name = "gradoAcademico")
    private String gradoAcademico;

    @ManyToOne
    @JoinColumn(name = "oidPersona", referencedColumnName = "oidPersona")
    private Persona persona;


    //CONSTRUCTORES
    public Investigador() {
    }

    public Investigador(Long oidInverstigador, Persona persona, String gradoAcademico, String dedicacion, String programaDeIncentivos, String categoriaUTN) {
        this.oidInverstigador = oidInverstigador;
        this.persona = persona;
        this.gradoAcademico = gradoAcademico;
        this.dedicacion = dedicacion;
        this.programaDeIncentivos = programaDeIncentivos;
        this.categoriaUTN = categoriaUTN;
    }

    //GETTERS
    public Long getOidInverstigador() {
        return oidInverstigador;
    }

    public String getCategoriaUTN() {
        return categoriaUTN;
    }

    public String getProgramaDeIncentivos() {
        return programaDeIncentivos;
    }

    public String getDedicacion() {
        return dedicacion;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public Persona getPersona() {
        return persona;
    }

    //SETTERS
    public void setOidInverstigador(Long oidInverstigador) {
        this.oidInverstigador = oidInverstigador;
    }

    public void setCategoriaUTN(String categoriaUTN) {
        this.categoriaUTN = categoriaUTN;
    }

    public void setProgramaDeIncentivos(String programaDeIncentivos) {
        this.programaDeIncentivos = programaDeIncentivos;
    }

    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
