package com.frameworks.sistemaavaliacao.coordenador.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.frameworks.sistemaavaliacao.secretaria.entities.Disciplina;
import com.frameworks.sistemaavaliacao.secretaria.entities.Docente;
import com.frameworks.sistemaavaliacao.secretaria.entities.Semestres;

@Entity
@Table(name = "Alocacao")
public class Alocacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "codDisciplina")
    private Disciplina codDisciplina;

    @ManyToOne
    @JoinColumn(name = "siape")
    private Docente siape;

    @ManyToOne
    @JoinColumn(name = "codSemestre")
    private Semestres codSemestre;
}
