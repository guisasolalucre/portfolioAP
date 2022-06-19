package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.modelo.Persona;
import com.lucreciaguisasola.portafolio.repositorios.PersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServicio implements IPersonaServicio{

    @Autowired
    public PersonaRepositorio personaRepo;

    @Override
    public List<Persona> lista() {
        return personaRepo.findAll();
    }

    @Override
    public void crear(Persona p) {
        personaRepo.save(p);
    }

    @Override
    public Persona buscar(Long id) {
        return personaRepo.findById(id).orElse(null);
    }

    @Override
    public void borrar(Long id) {
        personaRepo.deleteById(id);
    }

}
