
package com.lucreciaguisasola.portafolio.controladores;

import com.lucreciaguisasola.portafolio.modelo.Usuario;
import com.lucreciaguisasola.portafolio.repositorios.UsuarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("usuarios/")
public class UsuarioControlador {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @GetMapping("listaUsuarios")
    public List<Usuario> getUsers() {
        return this.usuarioRepositorio.findAll();
    }
    
    

}
