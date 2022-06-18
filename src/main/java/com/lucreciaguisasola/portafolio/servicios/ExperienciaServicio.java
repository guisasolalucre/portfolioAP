
package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.modelo.Experiencia;
import com.lucreciaguisasola.portafolio.repositorios.ExperienciaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ExperienciaServicio {

    @Autowired
    ExperienciaRepositorio expRepo;

    /*
    @Transactional(readOnly = true)
    public List<Experiencia> listaExp(Long id) throws Exception {
        return expRepo.listaExp(id);
    }
*/

}
