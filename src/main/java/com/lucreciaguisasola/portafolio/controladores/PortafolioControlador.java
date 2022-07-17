package com.lucreciaguisasola.portafolio.controladores;

import com.lucreciaguisasola.portafolio.modelo.Educacion;
import com.lucreciaguisasola.portafolio.modelo.Experiencia;
import com.lucreciaguisasola.portafolio.modelo.Habilidad;
import com.lucreciaguisasola.portafolio.modelo.Persona;
import com.lucreciaguisasola.portafolio.modelo.Proyecto;
import com.lucreciaguisasola.portafolio.servicios.IEducacionServicio;
import com.lucreciaguisasola.portafolio.servicios.IExperienciaServicio;
import com.lucreciaguisasola.portafolio.servicios.IHabilidadServicio;
import com.lucreciaguisasola.portafolio.servicios.IPersonaServicio;
import com.lucreciaguisasola.portafolio.servicios.IProyectoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortafolioControlador {
    
    //******************************************************************
    // PERSONA
    @Autowired
    private IPersonaServicio personaServ;
    
    @GetMapping("/datos")
    public Persona persona() throws Exception {
        long id = 1;
        return personaServ.buscar(id);
    }
    
    @PostMapping("/nuevaPersona")
    public void agregarPersona(@RequestBody Persona persona){
        personaServ.crear(persona);
    }
    
    @DeleteMapping("/eliminarPersona/{id}")
    public void borrarPersona(@PathVariable Long id){
        personaServ.borrar(id);
    }
    
    @PutMapping("/editarPersona/{id}")
    public void editarPersona(@PathVariable Long id,
                              @RequestBody Persona personaFinal){
        Persona personaEditar = personaServ.buscar(id);
        personaEditar.setFotoPerfil(personaFinal.getFotoPerfil());
        personaEditar.setFotoPortada(personaFinal.getFotoPortada());
        personaEditar.setAcercade(personaFinal.getAcercade());
        personaEditar.setOcupacion(personaFinal.getOcupacion());
        personaEditar.setGithub(personaFinal.getGithub());
        personaEditar.setLinkedin(personaFinal.getLinkedin());
        personaEditar.setWhatsapp(personaFinal.getWhatsapp());
        personaEditar.setEmail(personaFinal.getEmail());
        
        personaServ.crear(personaEditar);
    }
    
    
    //******************************************************************
    // EDUCACION
    @Autowired
    private IEducacionServicio eduServ;
    
    @PostMapping("/nuevaEducacion")
    public void agregarEducacion(@RequestBody Educacion edu){
        eduServ.crear(edu);
    }
    
    @GetMapping("/verEducacion")
    public List<Educacion> verEducacion(){
        return eduServ.lista();
    }
    
    @DeleteMapping("/eliminarEducacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
        eduServ.borrar(id);
    }
    
    @PutMapping("/editarEducacion/{id}")
    public void editarEducacion(@PathVariable Long id,
                              @RequestBody Educacion eduFinal){
        Educacion eduEditar = eduServ.buscar(id);
        eduEditar.setCarrera(eduFinal.getCarrera());
        eduEditar.setInstitucion(eduFinal.getInstitucion());
        eduEditar.setInicio(eduFinal.getInicio());
        eduEditar.setFin(eduFinal.getFin());
        eduEditar.setUbicacion(eduFinal.getUbicacion());
        
        eduServ.crear(eduEditar);
    }

    
    //******************************************************************
    // EXPERIENCIA
    @Autowired
    private IExperienciaServicio expServ;
    
    @PostMapping("/nuevaExperiencia")
    public void agregarExperiencia(@RequestBody Experiencia exp){
        expServ.crear(exp);
    }
    
    @GetMapping("/verExperiencia")
    public List<Experiencia> verExperiencia(){
        return expServ.lista();
    }
    
    @DeleteMapping("/eliminarExperiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expServ.borrar(id);
    }
    
    @PutMapping("/editarExperiencia/{id}")
    public void editarExperiencia(@PathVariable Long id,
                              @RequestBody Experiencia expFinal){
        Experiencia expEditar = expServ.buscar(id);
        expEditar.setPuesto(expFinal.getPuesto());
        expEditar.setEmpresa(expFinal.getEmpresa());
        expEditar.setInicio(expFinal.getInicio());
        expEditar.setFin(expFinal.getFin());
        expEditar.setUbicacion(expFinal.getUbicacion());
        expEditar.setDescripcion(expFinal.getDescripcion());
        
        expServ.crear(expEditar);
    }

    
    //******************************************************************
    //HABILIDAD
    @Autowired
    private IHabilidadServicio habServ;
    
    @PostMapping("/nuevaHabilidad")
    public void agregarHabilidad(@RequestBody Habilidad hab){
        habServ.crear(hab);
    }
    
    @GetMapping("/verHabilidades")
    public List<Habilidad> verHabilidades(){
        return habServ.lista();
    }
    
    @DeleteMapping("/eliminarHabilidad/{id}")
    public void borrarHabilidad(@PathVariable Long id){
        habServ.borrar(id);
    }
    
    @PutMapping("/editarHabilidad/{id}")
    public void editarHabilidad(@PathVariable Long id,
                              @RequestBody Habilidad habFinal){
        Habilidad habEditar = habServ.buscar(id);
        habEditar.setNombre(habFinal.getNombre());
        habEditar.setPorcentaje(habFinal.getPorcentaje());
        
        habServ.crear(habFinal);
    }

    
    //******************************************************************
    // PROYECTO
    @Autowired
    private IProyectoServicio proyServ;
    
    @PostMapping("/nuevoProyecto")
    public void agregarProyecto(@RequestBody Proyecto proy){
        proyServ.crear(proy);
    }
    
    @GetMapping("/verProyectos")
    public List<Proyecto> verProyectos(){
        return proyServ.lista();
    }
    
    @DeleteMapping("/eliminarProyecto/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyServ.borrar(id);
    }
    
    @PutMapping("/editarProyecto/{id}")
    public void editarProyecto(@PathVariable Long id,
                              @RequestBody Proyecto proyFinal){
        Proyecto proyEditar = proyServ.buscar(id);
        proyEditar.setNombre(proyFinal.getNombre());
        proyEditar.setLink(proyFinal.getLink());
        proyEditar.setDescripcion(proyFinal.getDescripcion());
        proyEditar.setInicio(proyFinal.getInicio());
        proyEditar.setFin(proyFinal.getFin());
        
        proyServ.crear(proyFinal);
    }

}
