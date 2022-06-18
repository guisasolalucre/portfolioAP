
package com.lucreciaguisasola.portafolio.repositorios;

import com.lucreciaguisasola.portafolio.modelo.Educacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepositorio extends JpaRepository<Educacion, Long>  {

    /*
    @Query("SELECT * from educacion e WHERE e.persona_id = id")
    public List<Educacion> listaEdu(Long id);
    */
}
