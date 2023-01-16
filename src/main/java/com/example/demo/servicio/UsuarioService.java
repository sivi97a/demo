package com.example.demo.servicio;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.modelo.Usuario;

public interface UsuarioService {
    
    ArrayList<Usuario> getAllUsuario();
    Optional<Usuario> getUsuarioById(Long id);
    Usuario saveUsuario(Usuario u);
}
