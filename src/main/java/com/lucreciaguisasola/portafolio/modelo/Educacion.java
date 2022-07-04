package com.lucreciaguisasola.portafolio.modelo;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String carrera;

    @Column(nullable = false)
    private String institucion;

    @Column(nullable = false)
    private String ubicacion;

    @Column(nullable = false)
    private String inicio;

    @Column(nullable = true)
    private String fin;

    public Educacion() {
    }
}
