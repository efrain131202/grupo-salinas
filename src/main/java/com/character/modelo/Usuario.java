package com.character.modelo;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USUARIO")
public class Usuario {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 
 @Column(name = "USUARIO")
 private String usuario;
 
 @Column(name = "CONTRASEÑA")
 private String contraseña;
 
 @Column(name = "ESTADO")
 private String estado;
 
 @OneToOne(cascade = CascadeType.ALL)
 @JoinColumn(name = "ID_PERSONA")
 private Persona persona;
 
 @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
 private List<UsuarioRol> usuarioRoles = new ArrayList<>();

 public Usuario() {
     super();
 }

 public Usuario(Long id, String usuario, String contraseña, String estado, Persona persona) {
     super();
     this.id = id;
     this.usuario = usuario;
     this.contraseña = contraseña;
     this.estado = estado;
     this.persona = persona;
 }

 // Getters and Setters
 public Long getId() {
     return id;
 }

 public void setId(Long id) {
     this.id = id;
 }

 public String getUsuario() {
     return usuario;
 }

 public void setUsuario(String usuario) {
     this.usuario = usuario;
 }

 public String getContraseña() {
     return contraseña;
 }

 public void setContraseña(String contraseña) {
     this.contraseña = contraseña;
 }

 public String getEstado() {
     return estado;
 }

 public void setEstado(String estado) {
     this.estado = estado;
 }

 public Persona getPersona() {
     return persona;
 }

 public void setPersona(Persona persona) {
     this.persona = persona;
 }

 public List<UsuarioRol> getUsuarioRoles() {
     return usuarioRoles;
 }

 public void setUsuarioRoles(List<UsuarioRol> usuarioRoles) {
     this.usuarioRoles = usuarioRoles;
 }
}
