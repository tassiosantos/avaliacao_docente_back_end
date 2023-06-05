package com.frameworks.sistemaavaliacao.models;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Disciplina {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

  
    @Column(nullable = false, name = "nome_disciplina")
    private String nomeDisciplina;

  
    // @Column(nullable = false, name = "carga_horaria")
    // private String cargaHoraria;

}



