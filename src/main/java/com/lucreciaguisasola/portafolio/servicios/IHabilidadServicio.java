
package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.modelo.Habilidad;
import java.util.List;

public interface IHabilidadServicio {

    public List<Habilidad> lista();
    
    public void crear(Habilidad hab);
    
    public void borrar(Long id);
    
    public Habilidad buscar(Long id);
    
}
