
package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.excepciones.MiExcepcion;
import com.lucreciaguisasola.portafolio.modelo.Roles;
import static com.lucreciaguisasola.portafolio.modelo.Roles.INVITADO;
import com.lucreciaguisasola.portafolio.modelo.Usuario;
import com.lucreciaguisasola.portafolio.repositorios.UsuarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio implements IUsuarioServicio {
    
    @Autowired
    private UsuarioRepositorio usuarioRepo;

    private boolean usuarioValido(String usuario){
        
        return (usuario.length()>=8);
    }
    
    private boolean passwordValida(String password){
        return (password.length()>=8);
    }
            
    @Override
    public void persistirUsuario(String usuario, String password, Roles rol) throws Exception{
        try {
            Usuario u = new Usuario();
            if(usuarioValido(usuario)){
                u.setUsername(usuario);
            } else {
                throw new MiExcepcion("Usuario inválido");
            }
            if(passwordValida(password)){
                u.setPassword(password);
            } else {
                throw new MiExcepcion("Contraseña inválida");
            }
            u.setRol(INVITADO);
            usuarioRepo.save(u);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("Error al registrar el usuario");
        }
    }
    @Override
    public List<Usuario> listarUsuarios() {
        try {
            
        } catch (Exception e) {
        }
    }

    @Override
    public Usuario buscarUsuario(Long id) {
        
    }

    @Override
    public void borrarUsuario(Long id) {
        
    }

    

}
