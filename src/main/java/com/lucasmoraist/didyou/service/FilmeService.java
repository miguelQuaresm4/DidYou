package com.lucasmoraist.didyou.service;

import com.lucasmoraist.didyou.exceptions.RecursoNaoEncontrado;
import com.lucasmoraist.didyou.model.Filme;
import com.lucasmoraist.didyou.model.Usuario;
import com.lucasmoraist.didyou.repository.FilmeRepository;
import com.lucasmoraist.didyou.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FilmeService {

    private final FilmeRepository repository;
    private final UsuarioRepository usuarioRepository;

    public FilmeService(FilmeRepository repository, UsuarioRepository usuarioRepository) {
        this.repository = repository;
        this.usuarioRepository = usuarioRepository;
    }

    public List<Filme> lista() {
        return this.repository.findAll();
    }

    public Filme salva(Long userId, Filme filme) {
        Usuario usuario = this.usuarioRepository.findById(userId)
                .orElseThrow(() -> new RecursoNaoEncontrado("Usuário não encontrado."));
        Filme novoFilme = new Filme(filme);
        novoFilme.setUsuarioId(usuario);

        return this.repository.save(novoFilme);
    }

    public Filme buscaUmFilmePeloId(UUID filmeId) {
        return this.repository.findById(filmeId)
                .orElseThrow(() -> new RecursoNaoEncontrado("Filme não encontrado!"));
    }

    public Filme atualizaFilme(UUID filmeId, Filme filme) {
        Filme filmeEncontrado = this.buscaUmFilmePeloId(filmeId);

        filmeEncontrado.atualiza(filme);
        this.repository.save(filmeEncontrado);

        return filmeEncontrado;
    }

    public void excluiFilme(UUID filmeId) {
        Filme filme = this.buscaUmFilmePeloId(filmeId);
        this.repository.delete(filme);
    }

}
