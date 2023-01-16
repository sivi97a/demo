package com.example.demo.servicio;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.modelo.Usuario;
import com.example.demo.repositorio.UsuarioRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public ArrayList<Usuario> getAllUsuario() {
        // TODO Auto-generated method stub
        return (ArrayList<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> getUsuarioById(Long id) {
        // TODO Auto-generated method stub
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario saveUsuario(Usuario u) {
        // TODO Auto-generated method stub
        return usuarioRepository.save(u);
    }
    
}
