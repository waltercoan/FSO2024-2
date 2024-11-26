package br.univille.fsoweb20242.controller;

import java.util.Collections;
import java.util.HashMap;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping    
    //@ResponseBody
    public ModelAndView index(@AuthenticationPrincipal OAuth2User principal){
        HashMap<String,Object> dados = new HashMap<>();
        //logica
        var username = principal.getAttribute("preferred_username");
        var role = principal.getAttribute("roles").toString();
        boolean isAdmin = role.indexOf("Admin") > 0;

        dados.put("isAdmin",isAdmin);
        dados.put("username",username);
        

        return new ModelAndView("home/index",dados);
    }
}
