
package com.lucreciaguisasola.portafolio.repositorios;

import com.lucreciaguisasola.portafolio.modelo.Habilidad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepositorio extends JpaRepository<Habilidad, Long>  {

    /*
    @Query("SELECT h from Habilidad h WHERE h.persona_id = id")
    public List<Habilidad> listaHab(Long id);
*/
}
