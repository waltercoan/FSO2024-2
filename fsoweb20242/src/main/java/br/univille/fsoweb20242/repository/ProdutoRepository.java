package br.univille.fsoweb20242.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.fsoweb20242.entity.Produto;

@Repository
public interface ProdutoRepository 
    extends JpaRepository<Produto,Long>{
    
}
