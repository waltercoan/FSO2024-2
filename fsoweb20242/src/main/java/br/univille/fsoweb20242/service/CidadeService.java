package br.univille.fsoweb20242.service;

import java.util.List;

import br.univille.fsoweb20242.entity.Cidade;

public interface CidadeService {
    Cidade save(Cidade cidade);
    Cidade getById(long id);
    List<Cidade> getAll();
}
