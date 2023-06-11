package com.frameworks.sistemaavaliacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Respostas")
public class Resposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "codPergunta")
    private Pergunta codPergunta;

    @Column(name = "matricula")
    private Integer matricula;

    @Column(name = "resposta", length = 100)
    private String resposta;

    @Column(name = "anonimo")
    private Boolean anonimo;
}
