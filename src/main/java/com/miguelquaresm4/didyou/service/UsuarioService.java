package com.miguelquaresm4.didyou.service;

import com.miguelquaresm4.didyou.model.Usuario;
import com.miguelquaresm4.didyou.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService     {

    private final UsuarioRepository repository;

    public  UsuarioService(UsuarioRepository repository){
        this.repository = repository;
    }
    public List<Usuario> listaTodosUsuarios(){
        return this.repository.findAll();
    }

    public Usuario salvaUsuario(Usuario usuario) {
        Usuario novoUsuario = new Usuario(usuario);
        return this.repository.save(novoUsuario);
    }
}
