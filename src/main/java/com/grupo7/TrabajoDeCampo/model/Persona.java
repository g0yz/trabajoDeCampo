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

    @Column(name = "horasSemanales")
    private String horasSemanales;

    @OneToOne
    @JoinColumn(name="usuario_id",referencedColumnName = "idUsuario")
    private Usuario Usuario;


    @ManyToOne
    @JoinColumn(name = "grupo_id",referencedColumnName = "idGrupo")
    private Grupo Grupo;


    //CONSTRUCTORES

    public Persona() {
    }

    public Persona(String nombre, String apellido, String horasSemanales){
        this.nombre = nombre;
        this.apellido = apellido;
        this.horasSemanales = horasSemanales;
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

    public String getHorasSemanales() {
        return horasSemanales;
    }

    public Grupo getGrupo() {
        return Grupo;
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

    public void setHorasSemanales(String horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public void setGrupo(Grupo grupo) {
        Grupo = grupo;
    }

}
