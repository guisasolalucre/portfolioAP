package com.lucreciaguisasola.portafolio.modelo;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNac;

    private String ubicacion;

    @Column(nullable = false)
    private String ocupacion;

    @Column(nullable = false)
    private String acercade;
    
    private String fotoPerfil;
    
    private String fotoPortada;
            
    public Persona() {
    }
    
}
