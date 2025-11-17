package com.grupo7.TrabajoDeCampo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Personal")
public class Personal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="oidPersonal")
    private Long oidPersonal;


    @Enumerated(EnumType.STRING)
    @Column(name="tipoPersonal")
    private TipoPersonal tipoPersonal;

    @ManyToOne
    @JoinColumn(name = "oidPersona", referencedColumnName = "oidPersona", nullable = false)
    private Persona Persona;


    public Personal() {
    }

    public Personal(Long oidPersonal, TipoPersonal tipoPersonal, Persona persona) {
        this.oidPersonal = oidPersonal;
        this.tipoPersonal = tipoPersonal;
        Persona = persona;
    }


    public Long getOidPersonal() {
        return oidPersonal;
    }

    public TipoPersonal getTipoPersonal() {
        return tipoPersonal;
    }

    public Persona getPersona() {
        return Persona;
    }


    public void setOidPersonal(Long oidPersonal) {
        this.oidPersonal = oidPersonal;
    }

    public void setTipoPersonal(TipoPersonal tipoPersonal) {
        this.tipoPersonal = tipoPersonal;
    }

    public void setPersona(Persona persona) {
        Persona = persona;
    }
}
