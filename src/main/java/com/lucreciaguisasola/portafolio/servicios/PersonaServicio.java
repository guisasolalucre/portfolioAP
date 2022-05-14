package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.excepciones.MiExcepcion;
import com.lucreciaguisasola.portafolio.modelo.Persona;
import com.lucreciaguisasola.portafolio.repositorios.PersonaRepositorio;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServicio{

    @Autowired
    public PersonaRepositorio personaRepo;

    private void validar(String nombre, String apellido, Date fechaNac, String ocupacion, String acercade) throws MiExcepcion {

        if (nombre == null || nombre.isEmpty() || nombre.contains("  ")) {
            throw new MiExcepcion("Error en el nombre");
        }
        if (apellido == null || apellido.isEmpty() || apellido.contains("  ")) {
            throw new MiExcepcion("Error en el apellido");
        }
        if (fechaNac == null) {
            throw new MiExcepcion("Error en la fecha de nacimiento");
        }
        if (ocupacion == null || ocupacion.isEmpty() || ocupacion.contains("  ")) {
            throw new MiExcepcion("Error en la ocupación");
        }
        if (acercade == null || acercade.isEmpty() || acercade.contains("  ") || acercade.length() > 200) {
            throw new MiExcepcion("Error en la sección 'Acerca de mí'");
        }
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void persistirPersona(String nombre, String apellido, Date fechaNac, String ocupacion, String acercade) throws Exception {
        try {
            validar(nombre, apellido, fechaNac, ocupacion, acercade);

            Persona p = new Persona ();

            p.setNombre(nombre);
            p.setApellido(apellido);
            p.setFechaNac(fechaNac);
            p.setOcupacion(ocupacion);
            p.setAcercade(acercade);
            
            personaRepo.save(p);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("Error al guardar el usuario");
        }

    }

    @Transactional(readOnly=true)
    public List<Persona> listarPersonas() throws Exception {
        return personaRepo.findAll();
    }

    @Transactional(readOnly=true)
    public Persona buscarPersona(Long id) throws Exception {
        return personaRepo.findById(id).orElse(null);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void borrarPersona(Long id) throws Exception {
        personaRepo.deleteById(id);
    }

}
