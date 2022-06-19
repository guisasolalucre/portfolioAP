
package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.modelo.Habilidad;
import com.lucreciaguisasola.portafolio.repositorios.HabilidadRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadServicio implements IHabilidadServicio {

    @Autowired
    HabilidadRepositorio habRepo;

    @Override
    public List<Habilidad> lista() {
        return habRepo.findAll();
    }

    @Override
    public void crear(Habilidad exp) {
        habRepo.save(exp);
    }

    @Override
    public void borrar(Long id) {
        habRepo.deleteById(id);
    }

    @Override
    public Habilidad buscar(Long id) {
        return habRepo.findById(id).orElse(null);
    }  

}
