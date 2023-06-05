package com.frameworks.sistemaavaliacao.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Usuario {
    
    @Id
    @NotNull
    private String login;


    @NotNull
    private String senha;
    
    
    @NotNull
    private String tipoUsuario;
}


