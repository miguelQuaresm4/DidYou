package com.lucasmoraist.didyou.service;

import com.lucasmoraist.didyou.model.Episodio;
import com.lucasmoraist.didyou.repository.EpisodioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpisodioService {

    private final EpisodioRepository repository;

    public EpisodioService(EpisodioRepository repository) {
        this.repository = repository;
    }

    public List<Episodio> lista() {
        return this.repository.findAll();
    }

    public Episodio salva(Episodio episodio) {
        return this.repository.save(new Episodio(episodio));
    }

}
