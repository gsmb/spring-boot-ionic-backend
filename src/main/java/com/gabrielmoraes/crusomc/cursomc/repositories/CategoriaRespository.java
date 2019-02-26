package com.gabrielmoraes.crusomc.cursomc.repositories;

import com.gabrielmoraes.crusomc.cursomc.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRespository extends JpaRepository<Categoria, Integer> {
    //categoriaRepository.saveAll(Arrays.asList(cat1, cat2))
}
