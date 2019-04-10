package com.gabrielmoraes.crusomc.cursomc.repositories;

import com.gabrielmoraes.crusomc.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
