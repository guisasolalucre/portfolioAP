
package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.modelo.Proyecto;
import com.lucreciaguisasola.portafolio.repositorios.ProyectoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoServicio implements IProyectoServicio {

    @Autowired
    ProyectoRepositorio proyRepo;

    @Override
    public List<Proyecto> lista() {
        return proyRepo.findAll();
    }

    @Override
    public void crear(Proyecto exp) {
        proyRepo.save(exp);
    }

    @Override
    public void borrar(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyecto buscar(Long id) {
        return proyRepo.findById(id).orElse(null);
    }  


}
