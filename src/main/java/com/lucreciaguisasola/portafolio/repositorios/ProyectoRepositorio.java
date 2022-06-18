
package com.lucreciaguisasola.portafolio.repositorios;

import com.lucreciaguisasola.portafolio.modelo.Proyecto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepositorio extends JpaRepository<Proyecto, Long>  {

    /*
    @Query("SELECT p from Proyecto p WHERE p.persona_id = id")
    public List<Proyecto> listaProy(Long id);
*/
}
