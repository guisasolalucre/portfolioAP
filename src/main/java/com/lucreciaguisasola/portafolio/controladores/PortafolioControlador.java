package com.lucreciaguisasola.portafolio.controladores;

import com.lucreciaguisasola.portafolio.modelo.Persona;
import com.lucreciaguisasola.portafolio.modelo.Educacion;
import com.lucreciaguisasola.portafolio.modelo.Experiencia;
import com.lucreciaguisasola.portafolio.modelo.Habilidad;
import com.lucreciaguisasola.portafolio.modelo.Proyecto;
import com.lucreciaguisasola.portafolio.servicios.EducacionServicio;
import com.lucreciaguisasola.portafolio.servicios.ExperienciaServicio;
import com.lucreciaguisasola.portafolio.servicios.HabilidadServicio;
import com.lucreciaguisasola.portafolio.servicios.PersonaServicio;
import com.lucreciaguisasola.portafolio.servicios.ProyectoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class PortafolioControlador {

    @Autowired
    PersonaServicio personaServ;

    @Autowired
    EducacionServicio eduServ;

    @Autowired
    ExperienciaServicio expServ;

    @Autowired
    HabilidadServicio habServ;

    @Autowired
    ProyectoServicio proyServ;

    /* trae la persona
    debería buscar por el id de la persona que se identifica
    sirve para tomar los datos de la persona y mostrarlos en el portfolio */
    @GetMapping("/persona")
    @ResponseBody
    public Persona persona() throws Exception {
        long id = 1;
        return personaServ.buscarPersona(id);
    }

    /*
    // traen las distintas listas y mas de la persona
    @GetMapping("/educacion")
    @ResponseBody
    public List<Educacion> educacion() throws Exception {
        long id = 1;
        return eduServ.listaEdu(id);
    }
    
    
    public List<Experiencia> experiencia() throws Exception {
        long id = 1;
        return expServ.listaExp(id);
    }
    */
    
    
 /*
 
	@PostMapping("/registro")
	public String guardar(ModelMap modelo, @RequestParam String nombre, @RequestParam String apodo, @RequestParam String foto, @RequestParam String raza ) {
		
		try {
			perroService.guardar(nombre, apodo, foto, raza);
			
			modelo.put("exito", "Registro exitoso");
			
			return "form-perro";
			
			
			
		} catch (Exception e) {
			
			modelo.put("error", "Falto algun dato");
			return "form-perro";
		}
	}

	@GetMapping("/modificar/{id}") //PATHVARIABLE
	public String modificar(@PathVariable String id, ModelMap modelo ) {
            
		modelo.put("perro", perroService.getOne(id));
            
		return "form-perro-modif";
	}
	
	@PostMapping("/modificar/{id}")
	public String modificar(ModelMap modelo, @PathVariable String id, @RequestParam String nombre, @RequestParam String apodo, @RequestParam String foto, @RequestParam String raza ) {
		
		try {
			perroService.modificar(id,nombre, apodo, foto, raza);
			modelo.put("exito", "Modificacion exitosa");
			
			return "list-perro";
		} catch (Exception e) {
			modelo.put("error", "Falto algun dato");   
			return "form-perro-modif";
		}
	}
	
	@GetMapping("/lista")
	public String lista(ModelMap modelo) {
		
		List<Perro> perrosLista = perroService.listarTodos();
		
		modelo.addAttribute("perros",perrosLista);

		
		return "list-perro";
	}
     */
}
