
package com.lucreciaguisasola.portafolio.repositorios;

import com.lucreciaguisasola.portafolio.modelo.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepositorio extends JpaRepository<Contacto, Long>  {

}
