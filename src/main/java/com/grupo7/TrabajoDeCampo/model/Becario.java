package com.grupo7.TrabajoDeCampo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Becarios")
public class Becario extends Persona{

    @Column(name ="fuenteDeFinanciamiento")
    private String fuenteDeFinanciamiento;

    @Column(name="tipoBecario_id")
    private String idTipoBecario;

    @ManyToOne
    @JoinColumn(name = "idTipoBecario")
    private TipoBecario tipoBecario;



}
