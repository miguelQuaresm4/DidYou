package com.miguelquaresm4.didyou.service;

import com.miguelquaresm4.didyou.model.Episodio;
import com.miguelquaresm4.didyou.model.Usuario;
import com.miguelquaresm4.didyou.repository.EpisodioRepository;
import com.miguelquaresm4.didyou.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpisodioService {

    private final EpisodioRepository repository;


    public EpisodioService(EpisodioRepository repository) {

        this.repository = repository;
    }

    //Esse metodo lista todos os episodios no banco de dados
    public List<Episodio> listaEP(){
        return this.repository.findAll();

    }


    //Salvar um novo episodio
    public Episodio salvaEpisodios(Episodio episodio) {
        Episodio novoEpisodio = new Episodio();


        novoEpisodio.setDuracao(episodio.getDuracao());
        novoEpisodio.setNumero(episodio.getNumero());
        novoEpisodio.setTitulo(episodio.getTitulo());

        return this.repository.save(novoEpisodio);
    }
}
