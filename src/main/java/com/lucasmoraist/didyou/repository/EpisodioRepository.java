package com.lucasmoraist.didyou.repository;

import com.lucasmoraist.didyou.model.Episodio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodioRepository extends JpaRepository<Episodio, Long> {
}
