package com.gabrielmoraes.crusomc.cursomc;

import com.gabrielmoraes.crusomc.cursomc.domain.Categoria;
import com.gabrielmoraes.crusomc.cursomc.domain.Produto;
import com.gabrielmoraes.crusomc.cursomc.repositories.CategoriaRespository;
import com.gabrielmoraes.crusomc.cursomc.repositories.ProdutoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

    @Autowired
    private ProdutoRespository produtoRespository;

    @Autowired
    private CategoriaRespository categoriaRespository;

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        Categoria cat1 = new Categoria(null, "Informática");
        Categoria cat2 = new Categoria(null, "Escritório");

        Produto p1 = new Produto(null, "computador", 2000.00);
        Produto p2 = new Produto(null, "impressora", 800.00);
        Produto p3 = new Produto(null, "mouse", 80.00);

        cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
        cat2.getProdutos().addAll(Arrays.asList(p2));

        p1.getCategorias().addAll(Arrays.asList(cat1));
        p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
        p2.getCategorias().addAll(Arrays.asList(cat1));

        categoriaRespository.saveAll(Arrays.asList(cat1, cat2));

        produtoRespository.saveAll(Arrays.asList(p1, p2, p3));

    }
}
