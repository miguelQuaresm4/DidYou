package com.lucasmoraist.didyou.controller;

import com.lucasmoraist.didyou.model.Filme;
import com.lucasmoraist.didyou.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    @Autowired
    private FilmeService service;

    @PostMapping("/userId/{userId}")
    public Filme salvaFilme(@PathVariable Long userId, @RequestBody Filme filme) {
        return this.service.salva(userId, filme);
    }

    @GetMapping
    public List<Filme> listaFilmes() {
        return this.service.lista();
    }

    @GetMapping("{filmeId}")
    public Filme buscaFilmePeloId(@PathVariable UUID filmeId) {
        return this.service.buscaUmFilmePeloId(filmeId);
    }

    @PutMapping("{filmeId}")
    public Filme atualizaFilme(@PathVariable UUID filmeId, @RequestBody Filme filme) {
        return this.service.atualizaFilme(filmeId, filme);
    }

    @DeleteMapping("{filmeId}")
    public void excluiFilme(@PathVariable UUID filmeId) {
        this.service.excluiFilme(filmeId);
    }

}
