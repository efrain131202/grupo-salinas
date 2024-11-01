package com.character.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "USUARIO_ROL")
public class UsuarioRol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "ID_ROL")
    private Rol rol;
    
    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;

    public UsuarioRol() {
        super();
    }

    public UsuarioRol(Long id, Rol rol, Usuario usuario) {
        super();
        this.id = id;
        this.rol = rol;
        this.usuario = usuario;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
