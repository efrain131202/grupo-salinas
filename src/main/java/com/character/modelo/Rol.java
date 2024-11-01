package com.character.modelo;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "ROL")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "TIPO")
    private String tipo;
    
    @OneToMany(mappedBy = "rol", cascade = CascadeType.ALL)
    private List<UsuarioRol> usuarioRoles = new ArrayList<>();

    public Rol() {
        super();
    }

    public Rol(Long id, String tipo) {
        super();
        this.id = id;
        this.tipo = tipo;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<UsuarioRol> getUsuarioRoles() {
        return usuarioRoles;
    }

    public void setUsuarioRoles(List<UsuarioRol> usuarioRoles) {
        this.usuarioRoles = usuarioRoles;
    }
}