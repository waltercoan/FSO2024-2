package br.univille.fsoweb20242.service;

import java.util.List;
import br.univille.fsoweb20242.entity.Cliente;

public interface ClienteService {
    List<Cliente> getAll();
    Cliente save(Cliente cliente);
    Cliente delete(long id);
    Cliente getById(long id);
}
