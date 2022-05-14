package com.lucreciaguisasola.portafolio.seguridad.servicios;

import com.lucreciaguisasola.portafolio.seguridad.entidades.Usuario;
import com.lucreciaguisasola.portafolio.seguridad.entidades.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.findByUsername(username);
        return UsuarioPrincipal.build(usuario);
    }
}
