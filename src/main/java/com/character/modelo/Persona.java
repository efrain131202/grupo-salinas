package com.character.modelo;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PERSONA")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "NOMBRES")
    private String nombres;
    
    @Column(name = "APELLIDOS")
    private String apellidos;
    
    @Column(name = "SEXO")
    private String sexo;
    
    @Column(name = "PAIS")
    private String pais;
    
    @Column(name = "DIRECCION")
    private String direccion;
    
    @OneToOne(mappedBy = "persona")
    private Usuario usuario;
    
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    private List<Publicacion> publicaciones = new ArrayList<>();

    public Persona() {
        super();
    }

    public Persona(Long id, String nombres, String apellidos, String sexo, String pais, String direccion) {
        super();
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.pais = pais;
        this.direccion = direccion;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
}
