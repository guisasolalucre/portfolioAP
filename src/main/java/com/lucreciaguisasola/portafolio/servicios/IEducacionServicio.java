
package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.modelo.Educacion;
import java.util.List;

public interface IEducacionServicio {

    public List<Educacion> lista();
    
    public void crear(Educacion edu);
    
    public void borrar(Long id);
    
    public Educacion buscar(Long id);
    
}
