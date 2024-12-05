package com.miguelquaresm4.didyou.repository;

import com.miguelquaresm4.didyou.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FilmeRepository extends JpaRepository<Filme, UUID>{
}
