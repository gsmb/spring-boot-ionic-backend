package com.gabrielmoraes.crusomc.cursomc.repositories;

import com.gabrielmoraes.crusomc.cursomc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
