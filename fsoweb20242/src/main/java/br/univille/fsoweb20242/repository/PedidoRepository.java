package br.univille.fsoweb20242.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.fsoweb20242.entity.Pedido;

@Repository
public interface PedidoRepository 
    extends JpaRepository<Pedido,Long>{
    
}
