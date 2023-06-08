package com.frameworks.sistemaavaliacao.model;

import javax.persistence.Entity;
import javax.persistence.Id;
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
