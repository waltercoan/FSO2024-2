package br.univille.fsoweb20242;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.univille.fsoweb20242.entity.Cidade;
import br.univille.fsoweb20242.entity.Produto;
import br.univille.fsoweb20242.service.CidadeService;
import br.univille.fsoweb20242.service.ProdutoService;

@Component
public class Startup {

    @Autowired
    private CidadeService serviceCidade;
    @Autowired
    private ProdutoService serviceProduto;

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event){
        var jlle = new Cidade();
        jlle.setId(1);
        jlle.setNome("Joinville");
        jlle.setEstado("Santa Catarina");
        serviceCidade.save(jlle);

        var jaragua = new Cidade();
        jaragua.setId(2);
        jaragua.setNome("Jaraguá do Sul");
        jaragua.setEstado("Santa Catarina");
        serviceCidade.save(jaragua);

        var nintendo = new Produto();
        nintendo.setDescricao("Nintendo Switch");
        nintendo.setValor(2000);
        serviceProduto.save(nintendo);
    }   
}
