
package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.modelo.Experiencia;
import java.util.List;

public interface IExperienciaServicio {

    public List<Experiencia> lista();
    
    public void crear(Experiencia exp);
    
    public void borrar(Long id);
    
    public Experiencia buscar(Long id);
    
}
