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
    @Column(name = "codSemestre")
    private Integer codSemestre;

    @NotNull
    private String periodo;

    @OneToMany(mappedBy = "codSemestre", cascade = CascadeType.ALL)
    private List<Alocacao> alocacoes;

    @OneToMany(mappedBy = "codSemestre", cascade = CascadeType.ALL)
    private List<Questionario> questionarios;

    public Semestres() {
        // Construtor padrão vazio
    }
    
    public Semestres(Integer codSemestre) {
        this.codSemestre = codSemestre;
    }

    // Getter e Setter para o atributo 'codSemestre'
    public Integer getCodSemestre() {
        return codSemestre;
    }

    public void setCodSemestre(Integer codSemestre) {
        this.codSemestre = codSemestre;
    }

    // Getter e Setter para o atributo 'periodo'
    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    // Getter e Setter para o atributo 'alocacoes'
    public List<Alocacao> getAlocacoes() {
        return alocacoes;
    }

    public void setAlocacoes(List<Alocacao> alocacoes) {
        this.alocacoes = alocacoes;
    }

    // Getter e Setter para o atributo 'questionarios'
    public List<Questionario> getQuestionarios() {
        return questionarios;
    }

    public void setQuestionarios(List<Questionario> questionarios) {
        this.questionarios = questionarios;
    }
}
