package com.frameworks.sistemaavaliacao.secretaria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frameworks.sistemaavaliacao.secretaria.entities.Discente;
import com.frameworks.sistemaavaliacao.secretaria.repositories.DiscenteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DiscenteService {

    private final DiscenteRepository discenteRepository;

    @Autowired
    public DiscenteService(DiscenteRepository discenteRepository) {
        this.discenteRepository = discenteRepository;
    }

    public Discente createDiscente(Discente discente) {
        return discenteRepository.save(discente);
    }

    public List<Discente> getAllDiscentes() {
        return discenteRepository.findAll();
    }

    public Optional<Discente> getDiscenteById(Integer id) {
        return discenteRepository.findById(id);
    }

    public Discente updateDiscente(Discente discente) {
        return discenteRepository.save(discente);
    }

    public void deleteDiscente(Integer id) {
        discenteRepository.deleteById(id);
    }
}
