package com.miguelquaresm4.didyou.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "t_filme")
@Table(name = "t_filme")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String titulo;
    private String sinopse;
    private String genero;
    private int ano;
    private Long duracao;
    private String diretor;
    private String atores;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuarioId;

    public Filme(Filme filme) {
        this.titulo = filme.getTitulo();
        this.sinopse = filme.getSinopse();
        this.genero = filme.getGenero();
        this.ano = filme.getAno();
        this.duracao = filme.getDuracao();
        this.diretor = filme.getDiretor();
        this.atores = filme.getAtores();
    }

    public void atualiza(Filme filme) {
        if (filme.getTitulo() != null) {
            this.titulo = filme.getTitulo();
        }
        if (filme.getSinopse() != null) {
            this.sinopse = filme.getSinopse();

        }
        if (filme.getGenero() != null) {
            this.genero = filme.getGenero();
        }
        if (filme.getAno() != 0) {
            this.ano = filme.getAno();
        }
        if(filme.getDuracao() != 0L) {
            this.duracao = filme.getDuracao();
        }
        if(filme.getDiretor() != null) {
            this.diretor = filme.getDiretor();
        }
        if (filme.getAtores() != null) {
            this.atores = filme.getAtores();
        }
    }
}
