package com.lucreciaguisasola.portafolio.modelo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import javax.validation.constraints.NotNull;
import lombok.*;

@Setter @Getter
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    @Column(unique = true)
    private String username;
    
    @NotNull
    private String password;
    
    @NotNull
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_rol", 
                joinColumns = @JoinColumn(name = "usuario_id"),
                inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private Set<Rol> roles = new HashSet<>();
    
    @OneToOne(cascade = CascadeType.ALL)
    private Persona persona;

    public Usuario() {
    }
    
}