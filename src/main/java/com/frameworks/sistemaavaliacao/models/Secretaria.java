package com.frameworks.sistemaavaliacao.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Secretaria {
    
    @Id
    private Integer codPergunta;

    @NotNull
    private String descricao;

    @NotNull
    private String tipoPergunta;
}
