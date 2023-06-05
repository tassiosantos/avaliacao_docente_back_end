package com.frameworks.sistemaavaliacao.secretaria.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Disciplina {
    @Id
    private Short codDisciplina;
    
    private String nomeDisciplina;
    
}
