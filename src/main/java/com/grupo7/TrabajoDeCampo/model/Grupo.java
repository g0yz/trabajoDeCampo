package com.grupo7.TrabajoDeCampo.model;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Grupos")
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGrupo")
    private Long idGrupo;

    @Column(name = "nombreGrupo")
    private String nombreGrupo;

    @Column(name = "sigla")
    private String sigla;

    @Column(name = "email")
    private String email;

    @Column(name = "organigrama")
    private String organigrama;

    @Column(name = "objetivoYDesarrollo")
    private String objetivoYDesarrollo;

    //verificar esto
    @OneToMany(mappedBy = "grupo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Documento> documentos = new ArrayList<>();

    //verificar esto
    @OneToMany(mappedBy = "grupo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Equipo> equipos = new ArrayList<>();


    //CONSTRUCTORES
    public Grupo(){
    }

    public Grupo(String nombreGrupo,String sigla, String email, String organigrama, String objetivoYDesarrollo ){
        this.nombreGrupo = nombreGrupo;
        this.sigla = sigla;
        this.email = email;
        this.organigrama = organigrama;
        this.objetivoYDesarrollo = objetivoYDesarrollo;

    }

    //GETTERS
    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public String getSigla() {
        return sigla;
    }

    public String getEmail() {
        return email;
    }

    public String getOrganigrama() {
        return organigrama;
    }

    public String getObjetivoYDesarrollo() {
        return objetivoYDesarrollo;
    }

    //SETTERS

    public void setNombreGrupo(String nombreGrupo){
        this.nombreGrupo= nombreGrupo;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOrganigrama(String organigrama){
        this.organigrama = organigrama;
    }

    public void setObjetivoYDesarrollo(String objetivoYDesarrollo){
        this.objetivoYDesarrollo = objetivoYDesarrollo;
    }

}