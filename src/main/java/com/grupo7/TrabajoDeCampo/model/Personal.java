package com.grupo7.TrabajoDeCampo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Personal")
public class Personal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="oidPersonal")
    private Long oidPersonal;

    enum ObjectType{
        PersonalProfesional,PersonalTecnicoAdministrativoYDeApoyo
    }

    @Enumerated(EnumType.STRING)
    @Column(name="objectType")
    private ObjectType objectType;

    @ManyToOne
    @JoinColumn(name = "oidPersona", referencedColumnName = "oidPersona", nullable = false)
    private Persona Persona;


    public Personal() {
    }

    public Personal(Long oidPersonal, ObjectType objectType, Persona persona) {
        this.oidPersonal = oidPersonal;
        this.objectType = objectType;
        Persona = persona;
    }


    public Long getOidPersonal() {
        return oidPersonal;
    }

    public ObjectType getObjectType() {
        return objectType;
    }

    public Persona getPersona() {
        return Persona;
    }


    public void setOidPersonal(Long oidPersonal) {
        this.oidPersonal = oidPersonal;
    }

    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    public void setPersona(Persona persona) {
        Persona = persona;
    }
}
