package com.lucasmoraist.didyou.service;

import com.lucasmoraist.didyou.exceptions.RecursoNaoEncontrado;
import com.lucasmoraist.didyou.model.LoginUsuario;
import com.lucasmoraist.didyou.model.Usuario;
import com.lucasmoraist.didyou.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    // Esse metódo lista todos usuários no banco de dados
    public List<Usuario> listaTodosUsuarios() {
        return this.repository.findAll();
    }

    // Salvar um novo usuário
    public Usuario salvaUsuario(Usuario usuario) {
        Usuario novoUsuario = new Usuario();

        novoUsuario.setNome(usuario.getNome());
        novoUsuario.setEmail(usuario.getEmail());
        novoUsuario.setSenha(usuario.getSenha());

        return this.repository.save(novoUsuario);
    }

    public String login(LoginUsuario login) {
        Usuario usuario = this.repository.findByEmail(login.getEmail())
                .orElseThrow(() -> new RecursoNaoEncontrado("Email ou senha inválidos"));

        if (!login.getPassword().equals(usuario.getSenha())) {
            throw new RuntimeException("Email ou senha inválidos");
        }

        return "token";
    }

}
