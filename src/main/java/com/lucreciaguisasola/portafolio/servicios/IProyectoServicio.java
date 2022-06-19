
package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.modelo.Proyecto;
import java.util.List;

public interface IProyectoServicio {

    public List<Proyecto> lista();
    
    public void crear(Proyecto exp);
    
    public void borrar(Long id);
    
    public Proyecto buscar(Long id);
    
}
