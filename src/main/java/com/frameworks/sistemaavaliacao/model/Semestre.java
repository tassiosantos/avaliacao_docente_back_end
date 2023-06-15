package com.frameworks.sistemaavaliacao.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Semestres")
public class Semestre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codSemestre")
    private Integer codSemestre;

    @NotNull
    @Column(name = "periodo")
    private String periodo;

    @OneToMany(mappedBy = "codSemestre", cascade = CascadeType.ALL)
    private List<Alocacao> alocacoes;

    @OneToMany(mappedBy = "codSemestre", cascade = CascadeType.ALL)
    private List<Questionario> questionarios;

    public Semestre() {
        // Construtor padrão vazio
    }

    public Semestre(Integer codSemestre) {
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
