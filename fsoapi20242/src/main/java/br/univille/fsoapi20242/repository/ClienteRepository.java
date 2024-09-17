package br.univille.fsoapi20242.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.fsoapi20242.entity.Cliente;

@Repository
public interface ClienteRepository 
        extends JpaRepository<Cliente,Long>{
}
