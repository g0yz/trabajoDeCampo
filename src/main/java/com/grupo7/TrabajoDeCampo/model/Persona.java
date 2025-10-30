package com.grupo7.TrabajoDeCampo.model;
import jakarta.persistence.*;

@Entity
@Table(name="Persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="oidPersona")
    private Long idPersona;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "horasSemanales")
    private String horasSemanales;

    @OneToOne
    @JoinColumn(name="oidUsuario",referencedColumnName = "oidUsuario",nullable = true)
    private Usuario Usuario;

    @ManyToOne
    @JoinColumn(name="oidGrupo", referencedColumnName = "oidGrupo", nullable = false)
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
    public void setIdPersona(Long idPersona) {
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
