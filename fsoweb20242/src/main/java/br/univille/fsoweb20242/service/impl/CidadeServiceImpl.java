package br.univille.fsoweb20242.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.univille.fsoweb20242.entity.Cidade;
import br.univille.fsoweb20242.repository.CidadeRepository;
import br.univille.fsoweb20242.service.CidadeService;

@Service
public class CidadeServiceImpl implements CidadeService {

    @Autowired
    private CidadeRepository repository;
    @Override
    public Cidade save(Cidade cidade) {
        return repository.save(cidade);
    }
    @Override
    public Cidade getById(long id) {
        var retorno = repository.findById(id);
        if(retorno.isPresent())
            return retorno.get();
        return null;
    }
    @Override
    public List<Cidade> getAll() {
        return repository.findAll();
    }
  
}
