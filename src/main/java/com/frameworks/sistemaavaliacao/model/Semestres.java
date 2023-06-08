package com.frameworks.sistemaavaliacao.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Semestres {
    
    @Id
    private Integer codSemestre;

    @NotNull
    private String periodo;

    @OneToMany(mappedBy = "codSemestre", cascade = CascadeType.ALL)
    @Column(name = "alocacao")
    @NotNull
    private List<Alocacao> alocacoes;

    
    @OneToMany(mappedBy = "codSemestre", cascade = CascadeType.ALL)
    @Column(name = "questionario")
    @NotNull
    private List<Questionario> questionarios;
}
