package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.excepciones.MiExcepcion;
import com.lucreciaguisasola.portafolio.modelo.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.lucreciaguisasola.portafolio.repositorios.UsuarioRepositorio;

@Service
@Transactional
public class UsuarioServicio {

    @Autowired
    UsuarioRepositorio usuarioRepository;

    private void validar(String username, String password) throws MiExcepcion {
        if (existsByNombUsername(username) || username == null
                || username.isEmpty() || username.length() < 8) {
            throw new MiExcepcion("Error en el nombre de usuario");
        }
        if (password == null || password.isEmpty() || password.length() < 8) {
            throw new MiExcepcion("Error en la contraseña");
        }
    }

    private Usuario crear(String username, String password) throws MiExcepcion {
        try {
            validar(username, password);

            Usuario u = new Usuario();

            u.setUsername(username);
            String encriptada = new BCryptPasswordEncoder().encode(password);
            u.setPassword(encriptada);



            return u;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("Error al crear el usuario");
        }
    }

    public boolean existsByNombUsername(String username) {
        return usuarioRepository.existsByUsername(username);
    }

    public void save(Usuario usuario) throws MiExcepcion {
        try {
            usuarioRepository.save(usuario);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("Error al guardar el usuario");
        }
    }

    @Transactional(readOnly = true)
    public List<Usuario> lista() throws Exception {
        return usuarioRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    public Usuario findByUsername(String username) {
        return usuarioRepository.findByUsername(username).get();
    }

    public void borrarUsuario(Long id) throws MiExcepcion {
        try {
            usuarioRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("Error al eliminar usuario");
        }
    }
}
