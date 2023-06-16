package com.frameworks.sistemaavaliacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Questionarios")
public class Questionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer id;

    // @ManyToOne
    // @JoinColumn(name = "codPergunta")
    // public Pergunta codPergunta;

    @OneToOne
    @JoinColumn(name = "codSemestre")
    private Semestre codSemestre;

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Getter e Setter para o atributo 

    // Getter e Setter para o atributo 'codSemestre'
    public Semestre getCodSemestre() {
        return codSemestre;
    }

    public void setCodSemestre(Semestre codSemestre) {
        this.codSemestre = codSemestre;
    }
}
