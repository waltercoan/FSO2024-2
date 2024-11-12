package br.univille.fsoweb20242.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.fsoweb20242.entity.Pedido;
import br.univille.fsoweb20242.repository.PedidoRepository;
import br.univille.fsoweb20242.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService{

    @Autowired
    private PedidoRepository repository;

    @Override
    public List<Pedido> getAll() {
        return repository.findAll();
    }

    @Override
    public Pedido save(Pedido pedido) {
        return repository.save(pedido);
    }

    @Override
    public Pedido delete(long id) {
        var pedido = getById(id);
        repository.delete(pedido);
        return pedido;
    }

    @Override
    public Pedido getById(long id) {
        return repository.getById(id);
    }
    
}
