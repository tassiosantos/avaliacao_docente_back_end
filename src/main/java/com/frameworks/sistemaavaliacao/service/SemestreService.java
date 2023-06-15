package com.frameworks.sistemaavaliacao.service;

import com.frameworks.sistemaavaliacao.model.Semestre;
import com.frameworks.sistemaavaliacao.repository.SemestreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SemestreService {

    private final SemestreRepository semestreRepository;

    @Autowired
    public SemestreService(SemestreRepository semestreRepository) {
        this.semestreRepository = semestreRepository;
    }

    public Semestre createSemestre(Semestre semestre) {
        return semestreRepository.save(semestre);
    }

    public List<Semestre> getAllSemestres() {
        return semestreRepository.findAll();
    }

    public Optional<Semestre> getSemestreById(Integer id) {
        return semestreRepository.findById(id);
    }

    public Semestre updateSemestre(Semestre semestre) {
        return semestreRepository.save(semestre);
    }

    public void deleteSemestre(Integer id) {
        semestreRepository.deleteById(id);
    }
}
