package com.frameworks.sistemaavaliacao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frameworks.sistemaavaliacao.model.Questionario;
import com.frameworks.sistemaavaliacao.repository.QuestionarioRepository;

@Service
public class QuestionarioService {
    private final QuestionarioRepository questionarioRepository;

    @Autowired
    public QuestionarioService(QuestionarioRepository questionarioRepository) {
        this.questionarioRepository = questionarioRepository;
    }

    public Questionario createQuestionario(Questionario questionario) {
        return questionarioRepository.save(questionario);
    }

    public void deleteQuestionario(Integer id) {
        questionarioRepository.deleteById(id);
    }
}
