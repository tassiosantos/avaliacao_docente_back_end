package com.frameworks.sistemaavaliacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.frameworks.sistemaavaliacao.model.Discente;
import com.frameworks.sistemaavaliacao.service.DiscenteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/discentes")
public class DiscenteController {

    private final DiscenteService discenteService;

    @Autowired
    public DiscenteController(DiscenteService discenteService) {
        this.discenteService = discenteService;
    }

    @PostMapping
    public ResponseEntity<Discente> createDiscente(@RequestBody Discente discente) {
        Discente createdDiscente = discenteService.createDiscente(discente);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDiscente);
    }

    @GetMapping
    public ResponseEntity<List<Discente>> getAllDiscentes() {
        List<Discente> discentes = discenteService.getAllDiscentes();
        return ResponseEntity.ok(discentes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Discente> getDiscenteById(@PathVariable("id") Integer id) {
        Optional<Discente> discente = discenteService.getDiscenteById(id);
        return discente.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Discente> updateDiscente(@PathVariable("id") Integer id, @RequestBody Discente discente) {
        discente.setMatricula(id);
        Discente updatedDiscente = discenteService.updateDiscente(discente);
        return ResponseEntity.ok(updatedDiscente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDiscente(@PathVariable("id") Integer id) {
        discenteService.deleteDiscente(id);
        return ResponseEntity.noContent().build();
    }
}
