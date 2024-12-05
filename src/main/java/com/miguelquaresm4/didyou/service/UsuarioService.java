package com.miguelquaresm4.didyou.service;

import com.miguelquaresm4.didyou.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService     {

    private final UsuarioRepository repository;

    public  UsuarioService(UsuarioRepository repository){
        this.repository = repository;
        
    }
}
