package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.modelo.Educacion;
import com.lucreciaguisasola.portafolio.repositorios.EducacionRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionServicio implements IEducacionServicio {

    @Autowired
    EducacionRepositorio eduRepo;

    @Override
    public List<Educacion> lista() {
        return eduRepo.findAll();
    }

    @Override
    public void crear(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrar(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscar(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
    
}
