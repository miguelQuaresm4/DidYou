package com.miguelquaresm4.didyou.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "t_episodio")
@Table(name = "t_episodio")
public class Episodio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private Long duracao;
    private Long numero;

    @ManyToOne
    @JoinColumn(name = "temp_id")
    private Temporada tempId;
}