package com.frameworks.sistemaavaliacao.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name = "Perguntas")
public class Pergunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codPergunta")
    public Integer codPergunta;

    @Column(name = "descricao", length = 200)
    public String descricao;

    @Column(name = "tipoPergunta", length = 40)
    public String tipoPergunta;

    // @OneToMany(mappedBy = "codPergunta", cascade = CascadeType.ALL)
    // public List<Questionario> questionarios;

    @OneToMany(mappedBy = "codPergunta", cascade = CascadeType.ALL)
    public List<Resposta> respostas;

    // Getter e Setters

    public Pergunta() {
        // Construtor padrão vazio
    }

    public Pergunta(Integer codPergunta) {
        this.codPergunta = codPergunta;
    }

    public Integer getCodPergunta() {
        return codPergunta;
    }

    public void setCodPergunta(Integer codPergunta) {
        this.codPergunta = codPergunta;
    }

    // Getter e Setter para o atributo 'descricao'
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getter e Setter para o atributo 'tipoPergunta'
    public String getTipoPergunta() {
        return tipoPergunta;
    }

    public void setTipoPergunta(String tipoPergunta) {
        this.tipoPergunta = tipoPergunta;
    }

    // Getter e Setter para o atributo 'questionarios'

    // Getter e Setter para o atributo 'respostas'
    public List<Resposta> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<Resposta> respostas) {
        this.respostas = respostas;
    }

    public void setSiape(Integer id) {
    }
}
