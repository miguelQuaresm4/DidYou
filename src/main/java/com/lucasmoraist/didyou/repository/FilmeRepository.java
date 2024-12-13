package com.lucasmoraist.didyou.repository;

import com.lucasmoraist.didyou.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, UUID> {
}
