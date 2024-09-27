package br.univille.fsoweb20242.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.fsoweb20242.entity.Cliente;
import br.univille.fsoweb20242.repository.ClienteRepository;
import br.univille.fsoweb20242.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository repository;

    @Override
    public List<Cliente> getAll() {
        return repository.findAll();
    }

    @Override
    public Cliente save(Cliente cliente) {
        repository.save(cliente);
        return cliente;
    }

    @Override
    public Cliente delete(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Cliente getById(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }
    
}
