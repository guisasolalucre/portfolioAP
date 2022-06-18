package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.modelo.Rol;
import com.lucreciaguisasola.portafolio.modelo.RolEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import com.lucreciaguisasola.portafolio.repositorios.RolRepositorio;

@Service
@Transactional
public class RolServicio {

    @Autowired
    RolRepositorio rolRepository;

    public Optional<Rol> getByRolNombre(RolEnum rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }
    
    public void deleteById(Long id){
        rolRepository.deleteById(id);
    }
}
