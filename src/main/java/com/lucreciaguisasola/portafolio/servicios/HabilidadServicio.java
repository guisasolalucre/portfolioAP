
package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.modelo.Habilidad;
import com.lucreciaguisasola.portafolio.repositorios.HabilidadRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HabilidadServicio {

    @Autowired
    HabilidadRepositorio habRepo;

    /*
    @Transactional(readOnly = true)
    public List<Habilidad> listaHab(Long id) throws Exception {
        return habRepo.listaHab(id);
    }
*/

}
