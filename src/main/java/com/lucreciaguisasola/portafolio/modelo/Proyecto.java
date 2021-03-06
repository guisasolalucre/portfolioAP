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
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String link;
    
    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private String inicio;

    @Column(nullable = true)
    private String fin;

    public Proyecto() {
    }

}
