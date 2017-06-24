/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.controllers;

import br.ufpr.rankeable.modelo.Usuario;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author helio
 */
@Controller
public class LoginController {
    
    @RequestMapping("/loginForm")
    public String loginForm(){
        return "formulario-login";
    }
    
    @RequestMapping("/efetuaLogin")
    public String efetuaLogin(Usuario usuario, HttpSession session){
        if (usuario.getNome().equals("Helio") &&
                usuario.getSenha().equals("123")){
            session.setAttribute("usuarioLogado", usuario);
            return "redirect:telaVotacao";
            
        } else {
            return "redirect:efetuaLogin";
        }
        
    }
    
}
