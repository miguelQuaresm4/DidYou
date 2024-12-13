package com.lucasmoraist.didyou.service;

import com.lucasmoraist.didyou.model.Temporada;
import com.lucasmoraist.didyou.repository.TemporadaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemporadaService {

    private final TemporadaRepository repository;

    public TemporadaService(TemporadaRepository repository) {
        this.repository = repository;
    }

    public List<Temporada> lista() {
        return this.repository.findAll();
    }

    public Temporada salva(Temporada temporada) {
        return this.repository.save(new Temporada(temporada));
    }

}
