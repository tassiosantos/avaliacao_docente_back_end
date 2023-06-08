package com.frameworks.sistemaavaliacao.coordenador.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frameworks.sistemaavaliacao.secretaria.repositories.DocenteRepository;

import com.frameworks.sistemaavaliacao.secretaria.entities.Docente;


@Service
public class CoordenadorService {

    private final DocenteRepository docenteRepository;

    @Autowired
    public CoordenadorService(DocenteRepository docenteRepository) {
        this.docenteRepository = docenteRepository;
    }

    public List<Docente> getAllForms() {
        return docenteRepository.findAll();
    }
}