package com.miguelquaresm4.didyou.model;

import com.miguelquaresm4.didyou.model.Serie;
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

}
