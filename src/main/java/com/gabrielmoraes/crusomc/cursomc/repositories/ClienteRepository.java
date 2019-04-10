package com.gabrielmoraes.crusomc.cursomc.repositories;

import com.gabrielmoraes.crusomc.cursomc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
