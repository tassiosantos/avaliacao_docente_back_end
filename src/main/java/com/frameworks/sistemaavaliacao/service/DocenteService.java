package com.frameworks.sistemaavaliacao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frameworks.sistemaavaliacao.model.Docente;
import com.frameworks.sistemaavaliacao.repository.DocenteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteService {

    private final DocenteRepository docenteRepository;

    @Autowired
    public DocenteService(DocenteRepository docenteRepository) {
        this.docenteRepository = docenteRepository;
    }

    public Docente createDocente(Docente docente) {
        return docenteRepository.save(docente);
    }

    public List<Docente> getAllDocentes() {
        return docenteRepository.findAll();
    }

    public Optional<Docente> getDocenteById(Integer id) {
        return docenteRepository.findById(id);
    }

    public Docente updateDocente(Docente docente) {
        return docenteRepository.save(docente);
    }

    public void deleteDocente(Integer id) {
        docenteRepository.deleteById(id);
    }
}