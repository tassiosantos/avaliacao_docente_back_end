package com.frameworks.sistemaavaliacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frameworks.sistemaavaliacao.model.Docente;
import com.frameworks.sistemaavaliacao.repository.DocenteRepository;


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