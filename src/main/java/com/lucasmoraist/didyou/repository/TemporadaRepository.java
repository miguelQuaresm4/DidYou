package com.lucasmoraist.didyou.repository;

import com.lucasmoraist.didyou.model.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemporadaRepository extends JpaRepository<Temporada, Long> {
}
