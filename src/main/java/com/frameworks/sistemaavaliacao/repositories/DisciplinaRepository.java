package com.frameworks.sistemaavaliacao.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import com.frameworks.sistemaavaliacao.models.Disciplina;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{

        
}
