package com.frameworks.sistemaavaliacao.secretaria.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.frameworks.sistemaavaliacao.secretaria.entities.Disciplina;
import com.frameworks.sistemaavaliacao.secretaria.services.DisciplinaService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController()
@CrossOrigin
@RequestMapping(value="disciplina")
public class DisciplinaController {

    private DisciplinaService disciplinaService;




    @PostMapping(path = "/nova")
    public ResponseEntity<Disciplina> novaDisciplina(@RequestBody @Valid Disciplina novaDisciplina){
        novaDisciplina = this.disciplinaService.create(novaDisciplina);
        ResponseEntity<Disciplina> responseEntity = new ResponseEntity<Disciplina>(novaDisciplina, HttpStatus.CONTINUE);
       
        return responseEntity;
        
    }

    @GetMapping(path = "/")
    public ResponseEntity<List <Disciplina>> getAll(){
        ResponseEntity<List<Disciplina>> disciplinaList = new ResponseEntity<List<Disciplina>>(this.disciplinaService.getAll(), HttpStatus.CONTINUE);
        return disciplinaList;
    }

    
//     GET disciplines - /discipline - Todos os disciplinas
// GET semesters - /semesters - Todos os semestres - Frontend filtra para o current
// GET reviews - /reviews - Todas as as avaliações de feedback
// GET/PUT review - /review /:id - Pegar a avaliações de feedback



}
