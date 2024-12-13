package com.lucasmoraist.didyou.service;

import com.lucasmoraist.didyou.model.Serie;
import com.lucasmoraist.didyou.repository.SerieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService {

    private final SerieRepository repository;

    public SerieService(SerieRepository repository) {
        this.repository = repository;
    }

    public List<Serie> lista() {
        return this.repository.findAll();
    }

    public Serie salva(Serie serie) {
        return this.repository.save(new Serie(serie));
    }

}
