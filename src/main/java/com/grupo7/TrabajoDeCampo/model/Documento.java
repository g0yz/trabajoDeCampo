package com.grupo7.TrabajoDeCampo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Documentos")
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDocumento")
    private long idDocumento;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "autores")
    private String autores;

    @Column(name = "editorial")
    private String editorial;

    @Column(name = "anio")
    private String anio;

    //verificar esto
    @ManyToOne
    @JoinColumn(name = "idGrupo")
    private Grupo grupo;


    //CONSTRUCTORES
    public Documento() {
    }

    public Documento(String titulo, String autores, String editorial, String anio){
        this.titulo = titulo;
        this.autores = autores;
        this.editorial = editorial;
        this.anio = anio;
    }

    //GETTERS
    public long getIdDocumento() {
        return idDocumento;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutores() {
        return autores;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getAnio() {
        return anio;
    }

    //SETTERS
    public void setAnio(String anio) {
        this.anio = anio;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIdDocumento(long idDocumento) {
        this.idDocumento = idDocumento;
    }
}
