package com.miguelquaresm4.didyou.controller;

import com.miguelquaresm4.didyou.model.Episodio;
import com.miguelquaresm4.didyou.service.EpisodioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/episodio")
public class EpisodioControler {

    @Autowired
    private EpisodioService service;

    @GetMapping
    public List<Episodio> ListaEp(){
        return this.service.listaEP();
    }

}
