package com.miguelquaresm4.didyou.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "t_usuario")
@Table(name = "t_usuario")
public class Usuario {

    /**
     * Long, int - Números inteiros
     * double e float - Números decimas
     * String - Texto
     * Date - para data
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;

}
