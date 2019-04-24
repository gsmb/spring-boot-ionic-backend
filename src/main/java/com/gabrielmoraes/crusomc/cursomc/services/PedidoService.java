package com.gabrielmoraes.crusomc.cursomc.services;

import com.gabrielmoraes.crusomc.cursomc.domain.Pedido;
import com.gabrielmoraes.crusomc.cursomc.repositories.PedidoRepository;
import com.gabrielmoraes.crusomc.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = pedidoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Onjeto não eocntrado! Id " + id + ", tipo: " + Pedido.class.getName()));

    }
}
