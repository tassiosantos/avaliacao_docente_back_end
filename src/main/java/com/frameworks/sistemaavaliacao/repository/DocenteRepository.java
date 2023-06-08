package com.frameworks.sistemaavaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frameworks.sistemaavaliacao.model.Docente;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Integer> {
}