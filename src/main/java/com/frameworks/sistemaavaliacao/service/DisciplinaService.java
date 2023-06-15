package com.frameworks.sistemaavaliacao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frameworks.sistemaavaliacao.model.Disciplina;
import com.frameworks.sistemaavaliacao.repository.DisciplinaRepository;

@Service
public class DisciplinaService {

    private final DisciplinaRepository disciplinaRepository;

    @Autowired
    public DisciplinaService(DisciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }

    public Disciplina createDisciplina(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    public List<Disciplina> getAllDisciplinas() {
        return disciplinaRepository.findAll();
    }

    public Optional<Disciplina> getDisciplinaById(Integer id) {
        return disciplinaRepository.findById(id);
    }

    public Disciplina updateDisciplina(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    public void deleteDisciplina(Integer id) {
        disciplinaRepository.deleteById(id);
    }
}
