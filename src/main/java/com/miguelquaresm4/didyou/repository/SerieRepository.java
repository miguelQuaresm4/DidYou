package com.miguelquaresm4.didyou.repository;

import com.miguelquaresm4.didyou.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SerieRepository extends JpaRepository<Serie, UUID> {
}
