
package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.modelo.Usuario;
import java.util.List;

public interface IUsuarioServicio {
    
    public void persistirUsuario(String usuario, String password) throws Exception;
    public List<Usuario> listarUsuarios() throws Exception;
    public Usuario buscarUsuario(Long id) throws Exception;
    public void borrarUsuario(Long id) throws Exception;

}
