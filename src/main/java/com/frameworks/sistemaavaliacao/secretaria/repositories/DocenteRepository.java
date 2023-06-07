package com.frameworks.sistemaavaliacao.secretaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frameworks.sistemaavaliacao.secretaria.entities.Docente;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Integer> {
}