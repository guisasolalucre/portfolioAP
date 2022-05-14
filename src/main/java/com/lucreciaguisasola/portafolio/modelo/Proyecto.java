package com.lucreciaguisasola.portafolio.modelo;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
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
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date inicio;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fin;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable( name = "proyecto_tecnologia",
                joinColumns = @JoinColumn( name = "proyecto_id"),
                inverseJoinColumns = @JoinColumn ( name = "tecnologia_id"))
    private List<Tecnologia> tecnologias;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "persona_id")
    private Persona persona;

    public Proyecto() {
    }

}
