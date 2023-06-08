package com.frameworks.sistemaavaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frameworks.sistemaavaliacao.model.Discente;

@Repository
public interface DiscenteRepository extends JpaRepository<Discente, Integer> {
}