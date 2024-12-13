package com.lucasmoraist.didyou.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "t_serie")
@Table(name = "t_serie")
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String titulo;
    private String sinopse;
    private String genero;
    private int ano;
    private String diretor;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuarioId;

    public Serie(Serie serie) {
        this.titulo = serie.getTitulo();
        this.sinopse = serie.getSinopse();
        this.genero = serie.getGenero();
        this.ano = serie.getAno();
        this.diretor = serie.getDiretor();
    }
}
