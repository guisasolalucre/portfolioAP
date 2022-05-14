package com.lucreciaguisasola.portafolio.seguridad.entidades;

import com.lucreciaguisasola.portafolio.seguridad.RolNombre;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.*;

@Setter @Getter
@Entity
public class Rol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;

    public Rol() {
    }

}
