
package com.lucreciaguisasola.portafolio.servicios;

import com.lucreciaguisasola.portafolio.modelo.Roles;
import com.lucreciaguisasola.portafolio.modelo.Usuario;
import java.util.List;

public interface IUsuarioServicio {
    
    public void persistirUsuario(String usuario, String password, Roles rol) throws Exception;
    public List<Usuario> listarUsuarios();
    public Usuario buscarUsuario(Long id);
    public void borrarUsuario(Long id);

}
