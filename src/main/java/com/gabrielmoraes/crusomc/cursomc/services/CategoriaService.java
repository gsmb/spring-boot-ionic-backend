package com.gabrielmoraes.crusomc.cursomc.services;

import com.gabrielmoraes.crusomc.cursomc.domain.Categoria;
import com.gabrielmoraes.crusomc.cursomc.repositories.CategoriaRespository;
import com.gabrielmoraes.crusomc.cursomc.services.Exceptions.DataIntegrityException;
import com.gabrielmoraes.crusomc.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRespository categoriaRespository;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = categoriaRespository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não eocntrado! Id " + id + ", tipo: " + Categoria.class.getName()));
    }

    public Categoria insert(Categoria obj) {
        obj.setId(null);
        return categoriaRespository.save(obj);
    }

    public Categoria update(Categoria obj) {
        find(obj.getId());
        return categoriaRespository.save(obj);
    }

    public void delete(Integer id) {
        find(id);
        try{
            categoriaRespository.deleteById(id);
        }catch (DataIntegrityViolationException e){
            throw new DataIntegrityException("Não é possível excluir uma categoria que possui produtos");
        }
    }
}
