package com.frameworks.sistemaavaliacao.secretaria.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disciplina {
    @Id
    private Short codDisciplina;
    
    private String nomeDisciplina;
    
}
