package com.grupo7.TrabajoDeCampo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Becario")
public class Becario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "oidBecario")
    private Long oidBecario;

    @Column(name = "fuenteFinanciamiento")
    private String fuenteFinanciamiento;

    enum ObjectType{
        Doctorado,MaestriaEspecializacion,BecarioGraduado,BecarioAlumno,Pasante,ProyectoFinalYTesinaDeGradoTrabajoFinalYTesisDePosgrado
    }

    @Column(name = "objectType")
    @Enumerated(EnumType.STRING)
    private ObjectType objectType;

    @ManyToOne
    @JoinColumn(name = "oidPersona", referencedColumnName = "oidPersona", nullable = false)
    private Persona Persona;


    public Becario() {
    }

    public Becario(Long oidBecario, String fuenteFinanciamiento, ObjectType objectType, Persona persona) {
        this.oidBecario = oidBecario;
        this.fuenteFinanciamiento = fuenteFinanciamiento;
        this.objectType = objectType;
        Persona = persona;
    }

    public Long getOidBecario() {
        return oidBecario;
    }

    public String getFuenteFinanciamiento() {
        return fuenteFinanciamiento;
    }

    public ObjectType getObjectType() {
        return objectType;
    }

    public Persona getPersona() {
        return Persona;
    }


    public void setOidBecario(Long oidBecario) {
        this.oidBecario = oidBecario;
    }

    public void setFuenteFinanciamiento(String fuenteFinanciamiento) {
        this.fuenteFinanciamiento = fuenteFinanciamiento;
    }

    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    public void setPersona(Persona persona) {
        Persona = persona;
    }
}
