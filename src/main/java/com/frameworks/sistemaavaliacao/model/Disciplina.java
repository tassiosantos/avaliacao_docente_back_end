package com.frameworks.sistemaavaliacao.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Disciplina {
    @Id
    private Short codDisciplina;
    
    private String nomeDisciplina;
    
    @OneToMany(mappedBy = "codDisciplina", cascade = CascadeType.ALL)
    @Column(name = "alocacao")
    @NotNull
    private List<Alocacao> alocacoes;
}
