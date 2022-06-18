
package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.modelo.Proyecto;
import com.lucreciaguisasola.portafolio.repositorios.ProyectoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProyectoServicio {

    @Autowired
    ProyectoRepositorio proyRepo;

    /*
    @Transactional(readOnly = true)
    public List<Proyecto> listaProy(Long id) throws Exception {
        return proyRepo.listaProy(id);
    }
*/

}
