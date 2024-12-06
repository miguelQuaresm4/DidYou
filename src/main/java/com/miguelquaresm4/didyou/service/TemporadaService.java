package com.miguelquaresm4.didyou.service;

import com.miguelquaresm4.didyou.model.Serie;
import com.miguelquaresm4.didyou.model.Temporada;
import com.miguelquaresm4.didyou.repository.SerieRepository;
import com.miguelquaresm4.didyou.repository.TemporadaRepository;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemporadaService {
    private final TemporadaRepository repository;

    public TemporadaService(TemporadaRepository repository) {
        this.repository = repository;
    }
    public List<Temporada> listaTodosTemporadas(){
        return this.repository.findAll();
    }

    public Temporada salvaTemporadas(Temporada temporadas) {
        Temporada novoTemporadas = new Temporada();

        novoTemporadas.setAno(temporadas.getAno());
        novoTemporadas.setNumero(temporadas.getNumero());

        return this.repository.save(novoTemporadas);
    }
}
