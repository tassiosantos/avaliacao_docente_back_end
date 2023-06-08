package com.frameworks.sistemaavaliacao.secretaria.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.frameworks.sistemaavaliacao.coordenador.entities.Alocacao;
import com.frameworks.sistemaavaliacao.coordenador.entities.Questionario;

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
