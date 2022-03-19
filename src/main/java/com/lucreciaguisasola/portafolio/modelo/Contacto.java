package com.lucreciaguisasola.portafolio.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String linkedin;

    @Column(nullable = false)
    private String github;

    @Column(nullable = false)
    private String whatsapp;

    @Column(nullable = false)
    private String email;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Persona persona;
    

}
