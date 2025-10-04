package com.grupo7.TrabajoDeCampo.model;
import jakarta.persistence.*;

@Entity
@Table(name="Usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private Long idUsuario;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name="idGrupo", referencedColumnName = "idGrupo")
    private Grupo grupo;


    //CONSTRUCTORES
    public Usuario(){
    }

    public Usuario(String email, String password){
        this.email = email;
        setPassword(password);
    }

    //GETTERS
    public Long getId(){
        return idUsuario;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    //SETTERS
    public void setId(Long id){
        this.idUsuario = id;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
