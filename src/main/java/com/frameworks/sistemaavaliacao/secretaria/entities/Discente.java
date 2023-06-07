package com.frameworks.sistemaavaliacao.secretaria.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Discentes")
public class Discente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matricula")
    private Integer matricula;

    @Column(name = "nomeDiscente", length = 40)
    private String nomeDiscente;

    // Getters and setters

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNomeDiscente() {
        return nomeDiscente;
    }

    public void setNomeDiscente(String nomeDiscente) {
        this.nomeDiscente = nomeDiscente;
    }
}