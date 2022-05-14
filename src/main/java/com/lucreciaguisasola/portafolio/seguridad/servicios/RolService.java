package com.lucreciaguisasola.portafolio.seguridad.servicios;

import com.lucreciaguisasola.portafolio.seguridad.entidades.Rol;
import com.lucreciaguisasola.portafolio.seguridad.RolNombre;
import com.lucreciaguisasola.portafolio.seguridad.repositorios.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }
    
    public void deleteById(Long id){
        rolRepository.deleteById(id);
    }
}
