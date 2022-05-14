
package com.lucreciaguisasola.portafolio.controladores;

import com.lucreciaguisasola.portafolio.modelo.Persona;
import com.lucreciaguisasola.portafolio.servicios.PersonaServicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PortafolioControlador {
    
    @Autowired
    PersonaServicio personaServ;

    @PreAuthorize("hasAnyRole('ROLE_PROPIETARIO','ROLE_INVITADO')")
    @GetMapping("/portafolio")
    public String portafolio(ModelMap modelo) throws Exception {
        long id = 1;
        Persona p = personaServ.buscarPersona(id);
        modelo.addAttribute("persona", p);
        return "redirect:/portafolio";
    }
    
    /*
    @PreAuthorize("hasAnyRole('ROLE_PROPIETARIO')")
    @GetMapping("/portafolio/editar")
    public String portafolio(HttpSession session, ModelMap modelo, @RequestParam Long id) {
        try {
            Persona p = personaServ.buscarPersona(id);
            modelo.addAttribute("persona", p);
        } catch (Exception ex) {
            modelo.addAttribute("error", ex.getMessage());
        }
        return "redirect:/portafolio/editar";
    }
    
    @PreAuthorize("hasAnyRole('ROLE_PROPIETARIO')")
    @GetMapping("/portafolio/editar")
    public String portafolio(HttpSession session, ModelMap modelo, @RequestParam Long id,
            @RequestParam String ocupacion, @RequestParam String acercade) {
        try {
            Persona p = personaServ.buscarPersona(id);
            modelo.addAttribute("persona", p);
        } catch (Exception ex) {
            modelo.addAttribute("error", ex.getMessage());
        }
        return "redirect:/portafolio";
    }
    */
}
