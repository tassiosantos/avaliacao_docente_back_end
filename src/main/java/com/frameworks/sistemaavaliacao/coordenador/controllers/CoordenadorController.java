package com.frameworks.sistemaavaliacao.coordenador.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frameworks.sistemaavaliacao.coordenador.services.CoordenadorService;
import com.frameworks.sistemaavaliacao.secretaria.entities.Docente;

@RestController
@RequestMapping("/coordenador")
public class CoordenadorController {
    private final CoordenadorService coordenadorService;

    @Autowired
    public CoordenadorController(CoordenadorService coordenadorService) {
        this.coordenadorService = coordenadorService;
    }

    // @PostMapping
    // public ResponseEntity<Docente> createDocente(@RequestBody Docente docente) {
    //     Docente createdDocente = docenteService.createDocente(docente);
    //     return ResponseEntity.status(HttpStatus.CREATED).body(createdDocente);
    // }

    @GetMapping
    public ResponseEntity<List<Docente>> getAllForms() {
        List<Docente> formularios = coordenadorService.getAllForms();
        return ResponseEntity.ok(formularios);
    }

    // @GetMapping("/{id}")
    // public ResponseEntity<Docente> getDocenteById(@PathVariable("id") Integer id) {
    //     Optional<Docente> docente = docenteService.getDocenteById(id);
    //     return docente.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    // }

    // @PutMapping("/{id}")
    // public ResponseEntity<Docente> updateDocente(@PathVariable("id") Integer id, @RequestBody Docente docente) {
    //     docente.setSiape(id);
    //     Docente updatedDocente = docenteService.updateDocente(docente);
    //     return ResponseEntity.ok(updatedDocente);
    // }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteDocente(@PathVariable("id") Integer id) {
    //     docenteService.deleteDocente(id);
    //     return ResponseEntity.noContent().build();
    // }
}
