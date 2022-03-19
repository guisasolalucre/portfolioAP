package com.lucreciaguisasola.portafolio.modelo;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
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
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date inicio;

    @Column(nullable = true)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fin;

    @Column(nullable = false)
    private String descripcion;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "persona_id")
    private Persona persona;

}
