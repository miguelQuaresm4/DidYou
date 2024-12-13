package com.lucasmoraist.didyou.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "t_temporada")
@Table(name = "t_temporada")
public class Temporada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long numero;
    private int ano;

    @ManyToOne
    @JoinColumn(name = "serie_id")
    private Serie serieId;

    public Temporada(Temporada temporada) {
        this.numero = temporada.getNumero();
        this.ano = temporada.getAno();
    }

}
