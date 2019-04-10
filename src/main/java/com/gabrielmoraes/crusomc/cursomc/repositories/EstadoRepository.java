package com.gabrielmoraes.crusomc.cursomc.repositories;

import com.gabrielmoraes.crusomc.cursomc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado,Integer> {
}
