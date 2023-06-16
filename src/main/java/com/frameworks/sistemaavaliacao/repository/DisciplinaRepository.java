package com.frameworks.sistemaavaliacao.repository;

import org.springframework.stereotype.Repository;

import com.frameworks.sistemaavaliacao.model.Disciplina;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer>{
}
