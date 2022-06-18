package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.repositorios.EducacionRepositorio;
import java.util.List;
import com.lucreciaguisasola.portafolio.modelo.Educacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EducacionServicio {

    @Autowired
    EducacionRepositorio eduRepo;

    /*
    @Transactional(readOnly = true)
    public List<Educacion> listaEdu(Long id) throws Exception {
        return eduRepo.listaEdu(id);
    }
*/

}
