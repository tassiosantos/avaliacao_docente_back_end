package com.frameworks.sistemaavaliacao.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Semestres {
    
    @Id
    private Integer codSemestre;

    @NotNull
    private String periodo;

}
