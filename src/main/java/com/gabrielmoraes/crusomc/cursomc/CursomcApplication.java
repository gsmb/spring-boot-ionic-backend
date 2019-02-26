package com.gabrielmoraes.crusomc.cursomc;

import com.gabrielmoraes.crusomc.cursomc.domain.Categoria;
import com.gabrielmoraes.crusomc.cursomc.repositories.CategoriaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

    @Autowired
    private CategoriaRespository categoriaRespository;

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        Categoria cat1 = new Categoria(null, "Informática");
        Categoria cat2 = new Categoria(null, "Escritório");

        categoriaRespository.saveAll(Arrays.asList(cat1, cat2));

    }
}
