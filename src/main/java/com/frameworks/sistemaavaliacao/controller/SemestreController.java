package com.frameworks.sistemaavaliacao.controller;

import com.frameworks.sistemaavaliacao.model.Semestre;
import com.frameworks.sistemaavaliacao.service.SemestreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/semestres")
public class SemestreController {

    private final SemestreService semestreService;

    @Autowired
    public SemestreController(SemestreService semestreService) {
        this.semestreService = semestreService;
    }

    @PostMapping
    public ResponseEntity<Semestre> createSemestre(@RequestBody Semestre semestre){
        Semestre createdSemestre = semestreService.createSemestre(semestre);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSemestre);
    }

    @GetMapping
    public ResponseEntity<List<Semestre>> getAllSemestres(){
        List<Semestre> semestres = semestreService.getAllSemestres();
        return ResponseEntity.ok(semestres);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Semestre> getSemestreById(@PathVariable("id") Integer id) {
        Optional<Semestre> semestre = semestreService.getSemestreById(id);
        return semestre.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Semestre> updateSemestre(@PathVariable("id") Integer id, @RequestBody Semestre semestre) {
        semestre.setCodSemestre(id);
        Semestre updatedSemestre = semestreService.updateSemestre(semestre);
        return ResponseEntity.ok(updatedSemestre);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSemestre(@PathVariable("id") Integer id) {
        semestreService.deleteSemestre(id);
        return ResponseEntity.noContent().build();
    }
}
