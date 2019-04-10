package com.gabrielmoraes.crusomc.cursomc.services;

import com.gabrielmoraes.crusomc.cursomc.domain.Categoria;
import com.gabrielmoraes.crusomc.cursomc.repositories.CategoriaRespository;
import com.gabrielmoraes.crusomc.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRespository categoriaRespository;

    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = categoriaRespository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Onjeto não eocntrado! Id " + id + ", tipo: " + Categoria.class.getName()));
    }
}
