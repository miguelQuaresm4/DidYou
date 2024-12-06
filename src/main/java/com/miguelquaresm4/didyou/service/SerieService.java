package com.miguelquaresm4.didyou.service;


import com.miguelquaresm4.didyou.model.Filme;
import com.miguelquaresm4.didyou.model.Serie;
import com.miguelquaresm4.didyou.repository.FilmeRepository;
import com.miguelquaresm4.didyou.repository.SerieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService {

    private final SerieRepository repository;

    public SerieService(SerieRepository repository) {
        this.repository = repository;
    }
    public List<Serie> listaTodosSeries(){
        return this.repository.findAll();
    }

    public Serie salvaSeries(Serie serie) {
        Serie novoSerie = new Serie();

        novoSerie.setAno(serie.getAno());
        novoSerie.setDiretor(serie.getDiretor());
        novoSerie.setGenero(serie.getGenero());
        novoSerie.setSinopse(serie.getSinopse());
        novoSerie.setTitulo(serie.getTitulo());

        return this.repository.save(novoSerie);
    }
}
