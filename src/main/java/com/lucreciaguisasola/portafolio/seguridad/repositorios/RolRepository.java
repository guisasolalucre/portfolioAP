package com.lucreciaguisasola.portafolio.seguridad.repositorios;

import com.lucreciaguisasola.portafolio.seguridad.entidades.Rol;
import com.lucreciaguisasola.portafolio.seguridad.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
