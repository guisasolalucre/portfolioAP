
package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.modelo.Experiencia;
import com.lucreciaguisasola.portafolio.repositorios.ExperienciaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaServicio implements IExperienciaServicio{

    @Autowired
    ExperienciaRepositorio expRepo;

    @Override
    public List<Experiencia> lista() {
        return expRepo.findAll();
    }

    @Override
    public void crear(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrar(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia buscar(Long id) {
        return expRepo.findById(id).orElse(null);
    }   

}
