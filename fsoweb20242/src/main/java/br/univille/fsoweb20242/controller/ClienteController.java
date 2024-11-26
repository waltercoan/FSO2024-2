package br.univille.fsoweb20242.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.fsoweb20242.entity.Cliente;
import br.univille.fsoweb20242.repository.ClienteRepository;
import br.univille.fsoweb20242.service.CidadeService;
import br.univille.fsoweb20242.service.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;
    @Autowired
    private CidadeService cidadeService;

    @GetMapping
    @PreAuthorize("hasAuthority('APPROLE_Admin') and hasAuthority('APPROLE_Read')")
    public ModelAndView index(){
        //chamar o banco de dados e fazer um select * from tabela
        var listaClientes = service.getAll();
        //montar a tela com os dados banco
        return new ModelAndView("cliente/index",
                "listaClientes",listaClientes);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        var cliente = new Cliente();
        var listaCidades = cidadeService.getAll();

        HashMap<String,Object> dados = 
            new HashMap<>();
        dados.put("cliente",cliente);
        dados.put("listaCidades",listaCidades);
        
        return new ModelAndView("cliente/form", 
                    dados);

    }
    @PostMapping
    public ModelAndView save(Cliente cliente){
        service.save(cliente);
        return new ModelAndView("redirect:/clientes");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        var umCliente = service.getById(id);
        var listaCidades = cidadeService.getAll();

        HashMap<String,Object> dados = new HashMap<>();
        dados.put("cliente",umCliente);
        dados.put("listaCidades",listaCidades);

        return new ModelAndView("cliente/form", dados);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){
        var umCliente = service.getById(id);
        if(umCliente != null){
            service.delete(id);
        }
        return new ModelAndView("redirect:/clientes");
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ModelAndView handle404Exception(AccessDeniedException ex) {
        return new ModelAndView("erro/403");
    }
}