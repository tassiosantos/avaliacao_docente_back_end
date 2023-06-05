package com.frameworks.sistemaavaliacao.secretaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.frameworks.sistemaavaliacao.secretaria.entities.Docente;
import com.frameworks.sistemaavaliacao.secretaria.services.DocenteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/docentes")
public class DocenteController {

    private final DocenteService docenteService;

    @Autowired
    public DocenteController(DocenteService docenteService) {
        this.docenteService = docenteService;
    }

    @PostMapping
    public ResponseEntity<Docente> createDocente(@RequestBody Docente docente) {
        Docente createdDocente = docenteService.createDocente(docente);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDocente);
    }

    @GetMapping
    public ResponseEntity<List<Docente>> getAllDocentes() {
        List<Docente> docentes = docenteService.getAllDocentes();
        return ResponseEntity.ok(docentes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Docente> getDocenteById(@PathVariable("id") Integer id) {
        Optional<Docente> docente = docenteService.getDocenteById(id);
        return docente.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Docente> updateDocente(@PathVariable("id") Integer id, @RequestBody Docente docente) {
        docente.setSiape(id);
        Docente updatedDocente = docenteService.updateDocente(docente);
        return ResponseEntity.ok(updatedDocente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDocente(@PathVariable("id") Integer id) {
        docenteService.deleteDocente(id);
        return ResponseEntity.noContent().build();
    }
}
