package com.example.demo.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Usuario;
import com.example.demo.servicio.UsuarioService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api")
@AllArgsConstructor
public class UsuarioControlador {

    private final UsuarioService usuarioService;

    @PostMapping("/save")
    public Usuario saveUsuario(@RequestBody Usuario u){
        return usuarioService.saveUsuario(u);
    }

    @GetMapping("/hola")
    public String saludar(){
        return "hola";
    }
    
}
