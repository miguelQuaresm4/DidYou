package com.miguelquaresm4.didyou.controller;

import com.miguelquaresm4.didyou.model.Usuario;
import com.miguelquaresm4.didyou.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {


    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> ListUsuario(){
        return this.service.listaTodosUsuarios();
    }
    @PostMapping
    public Usuario salvaUsuario(@RequestBody Usuario usuario) {
        return this.service.salvaUsuario(usuario);
    }
}