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

import com.frameworks.sistemaavaliacao.model.Pergunta;
import com.frameworks.sistemaavaliacao.service.PerguntaService;

@RestController
@RequestMapping({"/forms", "/form"})
public class PerguntaController {

    private final PerguntaService perguntaService;

    @Autowired
    public PerguntaController(PerguntaService perguntaService) {
        this.perguntaService = perguntaService;
    }
    
    @PostMapping
    public ResponseEntity<Pergunta> createPergunta(@RequestBody Pergunta pergunta) {
        Pergunta createdPergunta = perguntaService.createPergunta(pergunta);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPergunta);
    }
    

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePergunta(@PathVariable("id") Integer id) {
        perguntaService.deletePergunta(id);
        return ResponseEntity.noContent().build();
    }

}
