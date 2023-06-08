package com.frameworks.sistemaavaliacao.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Perguntas")
public class Pergunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codPergunta")
    private Integer codPergunta;

    @Column(name = "descricao", length = 200)
    private String descricao;

    @Column(name = "tipoPergunta", length = 40)
    private String tipoPergunta;

    @OneToMany(mappedBy = "codPergunta", cascade = CascadeType.ALL)
    @Column(name = "questionario")
    @NotNull
    private List<Questionario> questionarios;

    @OneToMany(mappedBy = "codPergunta", cascade = CascadeType.ALL)
    @Column(name = "resposta")
    @NotNull
    private List<Resposta> respostas;
}
