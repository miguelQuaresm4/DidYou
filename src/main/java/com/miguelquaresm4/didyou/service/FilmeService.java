package com.miguelquaresm4.didyou.service;

import com.miguelquaresm4.didyou.model.Filme;
import com.miguelquaresm4.didyou.model.Usuario;
import com.miguelquaresm4.didyou.repository.FilmeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    private final FilmeRepository repository;

    public FilmeService(FilmeRepository repository) {
        this.repository = repository;
    }
    public List<Filme> listaTodosFilmes(){
        return this.repository.findAll();
    }

    public Filme salvaFilme(Filme filme) {
        Filme novoFilme = new Filme();

        novoFilme.setAno(filme.getAno());
        novoFilme.setAtores(filme.getAtores());
        novoFilme.setDiretor(filme.getDiretor());
        novoFilme.setDuracao(filme.getDuracao());
        novoFilme.setGenero(filme.getGenero());
        novoFilme.setSinopse(filme.getSinopse());
        novoFilme.setTitulo(filme.getTitulo());

        return this.repository.save(novoFilme);
    }
}
