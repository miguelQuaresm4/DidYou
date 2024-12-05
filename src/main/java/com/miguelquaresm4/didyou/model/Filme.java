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

    @Id @GeneratedValue(strategy = GenerationType.UUID)
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

}
