package br.univille.fsoweb20242.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.fsoweb20242.repository.ClienteRepository;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public ModelAndView index(){
        //chamar o banco de dados e fazer um select * from tabela
        var listaClientes = repository.findAll();
        //montar a tela com os dados banco
        return new ModelAndView("cliente/index",
                "listaClientes",listaClientes);
    }
    
}