package com.frameworks.sistemaavaliacao.repository;

import com.frameworks.sistemaavaliacao.model.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemestreRepository extends JpaRepository<Semestre, Integer> {
}
