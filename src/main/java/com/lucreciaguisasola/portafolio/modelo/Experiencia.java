package com.lucreciaguisasola.portafolio.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String puesto;

    @Column(nullable = false)
    private String empresa;
    
    @Column(nullable = false)
    private String ubicacion;

    @Column(nullable = false)
    private String inicio;

    @Column(nullable = true)
    private String fin;
    
    @Column(nullable = false)
    private String descripcion;

    public Experiencia() {
    }

}
