package br.univille.fsoweb20242.service;

import java.util.List;
import br.univille.fsoweb20242.entity.Pedido;

public interface PedidoService {
    List<Pedido> getAll();
    Pedido save(Pedido Pedido);
    Pedido delete(long id);
    Pedido getById(long id);
}
