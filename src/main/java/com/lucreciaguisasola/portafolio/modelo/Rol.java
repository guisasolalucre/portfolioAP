package com.lucreciaguisasola.portafolio.modelo;


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
    private RolEnum rolNombre;

    public Rol() {
    }

}
