
package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.excepciones.MiExcepcion;
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

    private boolean usuarioValido(String usuario) throws MiExcepcion{
        boolean valido = false;
        if (usuarioRepo.buscarPorUsuario(usuario) != null){
            throw new MiExcepcion("El usuario ya se encuentra registrado");
        } else if (usuario.length()>=8){
            throw new MiExcepcion("El usuario debe tener como mínimo 8 caracteres");
        } else {
            valido = true;
        }
        return valido;
    }
    
    private boolean passwordValida(String password) throws MiExcepcion{
        boolean valida = false;
        if (password.length()>=8){
            throw new MiExcepcion("La contraseña debe tener como mínimo 8 caracteres");
        } else {
            valida = true;
        }
        return valida;
    }
            
    @Override
    public void persistirUsuario(String usuario, String password) throws Exception{
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
            throw new MiExcepcion("Error al guardar el usuario");
        }
    }
    
    @Override
    public List<Usuario> listarUsuarios() throws Exception{
        try {
            return usuarioRepo.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("No se encontró ningún usuario");
        }
    }

    @Override
    public Usuario buscarUsuario(Long id) throws MiExcepcion {
        try {
            return usuarioRepo.findById(id).orElse(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("No se encontró el usuario");
        }
    }

    @Override
    public void borrarUsuario(Long id) throws MiExcepcion {
        try {
            usuarioRepo.deleteById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("Error al eliminar usuario");
        }
    }

    

}
