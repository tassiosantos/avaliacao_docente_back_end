package com.frameworks.sistemaavaliacao.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.frameworks.sistemaavaliacao.models.Disciplina;
import com.frameworks.sistemaavaliacao.repositories.DisciplinaRepository;

@Service
public class DisciplinaService {
    private final DisciplinaRepository disciplinaRepository;



    public DisciplinaService(DisciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }



    public Disciplina create(@Valid Disciplina disciplina) {
        try {
            this.disciplinaRepository.save(disciplina);
        
        } catch (Exception e) {
            e.printStackTrace();
        }

       return disciplina;
    }

    public Disciplina update(@Valid Disciplina disciplina) {

        return this.disciplinaRepository.save(disciplina);
    }



    public List<Disciplina> getAll() {
        return this.disciplinaRepository.findAll();

    }
    
}
