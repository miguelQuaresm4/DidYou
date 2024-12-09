package com.miguelquaresm4.didyou.service;

import com.miguelquaresm4.didyou.model.Filme;
import com.miguelquaresm4.didyou.model.Usuario;
import com.miguelquaresm4.didyou.repository.FilmeRepository;
import com.miguelquaresm4.didyou.repository.UsuarioRepository;
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
    public List<Filme> listaTodosFilmes(){
        return this.repository.findAll();
    }

    public Filme salvaFilme(Long userId, Filme filme) {
        Usuario usuario = this.usuarioRepository.findById(userId)
                .orElseThrow(()->new RuntimeException("Usuario não encontrado"));
        Filme novoFilme = new Filme(filme);
        novoFilme.setUsuarioId(usuario);


        return this.repository.save(novoFilme);
    }

    public Filme buscaUmFilmePeloId(UUID filmeId) {
        return  this.repository.findById(filmeId).orElseThrow(()-> new RuntimeException("filme não encontrado!"));
    }

    public Filme atualizaFilme(UUID filmeId, Filme filme){
        Filme filmeEncontrado = this.buscaUmFilmePeloId(filmeId);

                filmeEncontrado.atualiza(filme);

                return filmeEncontrado;
    }

    public void excluiFilme(UUID filmeId) {
        Filme filme = this.buscaUmFilmePeloId(filmeId);
        this.repository.delete(filme);
    }
}
