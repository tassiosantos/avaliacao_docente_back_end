package com.frameworks.sistemaavaliacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frameworks.sistemaavaliacao.model.Questionario;
import com.frameworks.sistemaavaliacao.service.QuestionarioService;

@RestController
@RequestMapping({"/forms", "/form"})
public class QuestionarioController {

    private final QuestionarioService questionarioService;

    @Autowired
    public QuestionarioController(QuestionarioService questionarioService) {
        this.questionarioService = questionarioService;
    }
    
    @PostMapping
    public ResponseEntity<Questionario> createQuestionario(@RequestBody Questionario questionario) {
        Questionario createdQuestionario = questionarioService.createQuestionario(questionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdQuestionario);
    }
    

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuestionario(@PathVariable("id") Integer id) {
        questionarioService.deleteQuestionario(id);
        return ResponseEntity.noContent().build();
    }

}
