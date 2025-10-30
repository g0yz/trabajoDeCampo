package com.grupo7.TrabajoDeCampo.model;
import jakarta.persistence.*;

@Entity
@Table(name="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "oidUsuario")
    private Long oidUsuario;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    //CONSTRUCTORES
    public Usuario(){
    }

    public Usuario(String email, String password){
        this.email = email;
        setPassword(password);
    }

    //GETTERS
    public Long getId(){
        return oidUsuario;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    //SETTERS
    public void setId(Long id){
        this.oidUsuario = id;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
