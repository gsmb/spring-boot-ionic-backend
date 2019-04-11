package com.gabrielmoraes.crusomc.cursomc.services;

import com.gabrielmoraes.crusomc.cursomc.domain.Cliente;
import com.gabrielmoraes.crusomc.cursomc.repositories.ClienteRepository;
import com.gabrielmoraes.crusomc.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente buscar(Integer id) {
        Optional<Cliente> obj = clienteRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Onjeto não eocntrado! Id " + id + ", tipo: " + Cliente.class.getName()));

    }

}
