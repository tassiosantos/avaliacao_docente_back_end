package com.frameworks.sistemaavaliacao.model;

import javax.persistence.Entity;
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




    public String getLogin() {
        return login;
    }


    public void setLogin(String login) {
        this.login = login;
    }

        
    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


}


