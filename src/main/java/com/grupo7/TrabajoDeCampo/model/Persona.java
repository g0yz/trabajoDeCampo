package com.grupo7.TrabajoDeCampo.model;
import jakarta.persistence.*;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Personas")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPersona")
    private long idPersona;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @ManyToOne
    @JoinColumn(name="usuario_id",referencedColumnName = "idUsuario")
    private Usuario Usuario;


    @ManyToOne
    @JoinColumn(name = "grupo_id",referencedColumnName = "idGrupo")
    private Grupo Grupo;


    //CONSTRUCTORES

    public Persona() {
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //GETTERS

    public long getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    //SETTERS

    public void setIdPersona(long idPersona) {
        this.idPersona = idPersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public void setUsuario(Usuario usuario) {
        Usuario = usuario;
    }

}
