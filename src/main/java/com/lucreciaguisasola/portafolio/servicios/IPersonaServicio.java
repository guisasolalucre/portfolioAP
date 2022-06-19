
package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.modelo.Persona;
import java.util.List;

public interface IPersonaServicio {
    
    public List<Persona> lista();
    
    public void crear(Persona p);
    
    public Persona buscar(Long id);
    
    public void borrar(Long id);

}
