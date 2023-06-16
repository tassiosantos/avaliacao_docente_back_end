package com.frameworks.sistemaavaliacao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frameworks.sistemaavaliacao.model.Docente;
import com.frameworks.sistemaavaliacao.model.Pergunta;
import com.frameworks.sistemaavaliacao.repository.PerguntaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PerguntaService {

    private final PerguntaRepository perguntaRepository;

    @Autowired
    public PerguntaService(PerguntaRepository perguntaRepository) {
        this.perguntaRepository = perguntaRepository;
    }

    public Pergunta createPergunta(Pergunta pergunta) {
        return perguntaRepository.save(pergunta);
    }

    public List<Pergunta> getAllPerguntas() {
        return perguntaRepository.findAll();
    }

    public Optional<Pergunta> getPerguntaById(Integer id) {
        return perguntaRepository.findById(id);
    }

    public Pergunta updatePergunta(Pergunta pergunta) {
        return perguntaRepository.save(pergunta);
    }

    public void perguntaDocente(Integer id) {
        perguntaRepository.deleteById(id);
    }

    public void deletePergunta(Integer id) {
    }
}
