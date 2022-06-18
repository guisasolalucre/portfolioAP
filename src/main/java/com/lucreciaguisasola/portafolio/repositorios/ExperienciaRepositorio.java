
package com.lucreciaguisasola.portafolio.repositorios;

import com.lucreciaguisasola.portafolio.modelo.Experiencia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepositorio extends JpaRepository<Experiencia, Long>  {

    /*
    @Query("SELECT e from Experiencia e WHERE e.persona_id = id")
    public List<Experiencia> listaExp(Long id);
*/
}
