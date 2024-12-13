package com.lucasmoraist.didyou.controller;

import com.lucasmoraist.didyou.model.LoginUsuario;
import com.lucasmoraist.didyou.model.Usuario;
import com.lucasmoraist.didyou.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    // Requisição para listagem
    @GetMapping
    public List<Usuario> listUsuario() {
        return this.service.listaTodosUsuarios();
    }

    @PostMapping("register")
    public Usuario salvaUsuario(@RequestBody Usuario usuario) {
        return this.service.salvaUsuario(usuario);
    }

    @PostMapping("login")
    public String login(@RequestBody @Valid LoginUsuario login) {
        return this.service.login(login);
    }

}
