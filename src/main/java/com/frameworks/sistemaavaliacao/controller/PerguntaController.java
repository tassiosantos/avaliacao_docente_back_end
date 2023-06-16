package com.frameworks.sistemaavaliacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frameworks.sistemaavaliacao.model.Docente;
import com.frameworks.sistemaavaliacao.model.Pergunta;
import com.frameworks.sistemaavaliacao.service.PerguntaService;

@RestController
@RequestMapping({"/pergunta", "/perguntas"})
public class PerguntaController {

    // private final PerguntaService perguntaService;

    // @Autowired
    // public PerguntaController(PerguntaService perguntaService) {
    //     this.perguntaService = perguntaService;
    // }
    
    // @PostMapping
    // public ResponseEntity<Pergunta> createPergunta(@RequestBody Pergunta pergunta) {
    //     Pergunta createdPergunta = perguntaService.createPergunta(pergunta);
    //     return ResponseEntity.status(HttpStatus.CREATED).body(createdPergunta);
    // }

    // @GetMapping
    // public ResponseEntity<List<Docente>> getAllPerguntas() {
    //     List<Pergunta> perguntas = perguntaService.getAllPerguntas();
    //     return ResponseEntity.ok(perguntas);
    // }

    // @GetMapping("/{id}")
    // public ResponseEntity<Pergunta> getPerguntaById(@PathVariable("id") Integer id) {
    //     Optional<Pergunta> pergunta = perguntaService.getPerguntaById(id);
    //     return pergunta.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    // }

    // @PutMapping("/{id}")
    // public ResponseEntity<Pergunta> updatePergunta(@PathVariable("id") Integer id, @RequestBody Pergunta pergunta) {
    //     pergunta.setSiape(id);
    //     Pergunta updatedPergunta = perguntaService.updatePergunta(pergunta);
    //     return ResponseEntity.ok(updatedPergunta);
    // }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deletePergunta(@PathVariable("id") Integer id) {
    //     perguntaService.deletePer   gunta(id);
    //     return ResponseEntity.noContent().build();
    // }

}
