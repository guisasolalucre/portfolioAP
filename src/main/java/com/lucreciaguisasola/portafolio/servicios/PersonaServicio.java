
package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.modelo.Persona;
import com.lucreciaguisasola.portafolio.repositorios.PersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServicio implements IPersonaServicio {
    
    @Autowired
    public PersonaRepositorio pr;

    @Override
    public List<Persona> listarPersonas() {
        return pr.findAll();
    }

    @Override
    public void persistirPersona(Persona p) {
        pr.save(p);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return pr.findById(id).orElse(null);
    }

    @Override
    public void borrarPersona(Long id) {
        pr.deleteById(id);
    }

    

}
