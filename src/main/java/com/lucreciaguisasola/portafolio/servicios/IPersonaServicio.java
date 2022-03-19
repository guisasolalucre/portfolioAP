
package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.modelo.Persona;
import java.util.List;

public interface IPersonaServicio {

    public List<Persona> listarPersonas();
    public void persistirPersona(Persona p);
    public Persona buscarPersona(Long id);
    public void borrarPersona(Long id);
    
}
