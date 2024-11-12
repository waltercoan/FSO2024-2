package br.univille.fsoweb20242.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.fsoweb20242.entity.Pedido;
import br.univille.fsoweb20242.service.PedidoService;

@Controller
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService service;

    @GetMapping
    public ModelAndView index(){
        var listaPedidos = service.getAll();
        return new ModelAndView("pedido/index",
                "listaPedidos",listaPedidos);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        var pedido = new Pedido();

        HashMap<String,Object> dados = 
            new HashMap<>();
        dados.put("pedido",pedido);
        
        return new ModelAndView("pedido/form", 
                    dados);

    }
    @PostMapping
    public ModelAndView save(Pedido pedido){
        service.save(pedido);
        return new ModelAndView("redirect:/pedidos");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        var pedido = service.getById(id);

        HashMap<String,Object> dados = new HashMap<>();
        dados.put("pedido",pedido);
        

        return new ModelAndView("pedido/form", dados);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){
        var pedido = service.getById(id);
        if(pedido != null){
            service.delete(id);
        }
        return new ModelAndView("redirect:/pedidos");
    }
}
