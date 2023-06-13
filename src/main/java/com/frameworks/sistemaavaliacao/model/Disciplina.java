package com.frameworks.sistemaavaliacao.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Disciplinas")
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codDisciplina")
    private Integer codDisciplina;

    @Column(name = "nomeDisciplina", length = 80)
    @NotNull
    private String nomeDisciplina;

    @OneToMany(mappedBy = "codDisciplina", cascade = CascadeType.ALL)
    @Column(name = "alocacao")
    @NotNull
    private List<Alocacao> alocacoes;

    public Disciplina() {
    }

    public Integer getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(Integer codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public List<Alocacao> getAlocacoes() {
        return alocacoes;
    }

    public void setAlocacoes(List<Alocacao> alocacoes) {
        this.alocacoes = alocacoes;
    }
}
