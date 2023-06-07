package com.frameworks.sistemaavaliacao.secretaria.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Docentes")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "siape")
    private Integer siape;

    @Column(name = "nomeDocente", length = 80)
    private String nomeDocente;

    @Column(name = "eCoordenador")
    private Boolean eCoordenador;

    // Getters and setters

    public Integer getSiape() {
        return siape;
    }

    public void setSiape(Integer siape) {
        this.siape = siape;
    }

    public String getNomeDocente() {
        return nomeDocente;
    }

    public void setNomeDocente(String nomeDocente) {
        this.nomeDocente = nomeDocente;
    }

    public Boolean getECoordenador() {
        return eCoordenador;
    }

    public void setECoordenador(Boolean eCoordenador) {
        this.eCoordenador = eCoordenador;
    }
}