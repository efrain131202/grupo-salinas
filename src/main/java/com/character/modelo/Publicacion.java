package com.character.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "PUBLICACION")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "ID_PERSONA")
    private Persona persona;
    
    @Column(name = "CUERPO")
    private String cuerpo;

    public Publicacion() {
        super();
    }

    public Publicacion(Long id, Persona persona, String cuerpo) {
        super();
        this.id = id;
        this.persona = persona;
        this.cuerpo = cuerpo;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
}
