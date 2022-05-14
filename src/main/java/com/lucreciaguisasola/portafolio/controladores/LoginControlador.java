package com.lucreciaguisasola.portafolio.controladores;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoginControlador {

    @GetMapping("/login")
    public String login() {
        return "redirect:/login";
    }
    
    @PostMapping("/login")
    public String login(ModelMap modelo, @RequestParam String username, @RequestParam String password){
        if ( /*se logueo bien*/ 1==1){
            return "redirect:/portafolio";
        } else {
            modelo.addAttribute("error", "Error en las credenciales");
            return "redirect:/login";
        }
    }
    
    
}