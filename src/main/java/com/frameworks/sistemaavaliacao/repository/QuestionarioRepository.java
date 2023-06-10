package com.frameworks.sistemaavaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frameworks.sistemaavaliacao.model.Questionario;

@Repository
public interface QuestionarioRepository extends JpaRepository<Questionario, Integer> {
}
