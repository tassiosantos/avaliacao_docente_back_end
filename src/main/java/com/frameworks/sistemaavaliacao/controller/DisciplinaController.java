package com.frameworks.sistemaavaliacao.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.frameworks.sistemaavaliacao.model.Disciplina;
import com.frameworks.sistemaavaliacao.service.DisciplinaService;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    private final DisciplinaService disciplinaService;

    @Autowired
    public DisciplinaController(DisciplinaService disciplinaService) {
        this.disciplinaService = disciplinaService;
    }

    @PostMapping
    public ResponseEntity<Disciplina> createDisciplina(@RequestBody Disciplina disciplina){
        Disciplina createdDisciplina = disciplinaService.createDisciplina(disciplina);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDisciplina);
    }

    @GetMapping
    public ResponseEntity<List<Disciplina>> getAllDisciplinas(){
        List<Disciplina> disciplinas = disciplinaService.getAllDisciplinas();
        return ResponseEntity.ok(disciplinas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Disciplina> getDisciplinaById(@PathVariable("id") Integer id) {
        Optional<Disciplina> disciplina = disciplinaService.getDisciplinaById(id);
        return disciplina.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Disciplina> updateDisciplina(@PathVariable("id") Integer id, @RequestBody Disciplina disciplina) {
        disciplina.setCodDisciplina(id);
        Disciplina updatedDisciplina = disciplinaService.updateDisciplina(disciplina);
        return ResponseEntity.ok(updatedDisciplina);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDisciplina(@PathVariable("id") Integer id) {
        disciplinaService.deleteDisciplina(id);
        return ResponseEntity.noContent().build();
    }
}
