/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.controllers;

import br.ufpr.rankeable.logica.LogicaCadastroRankeavel;
import br.ufpr.rankeable.logica.LogicaCadastroUsuario;
import br.ufpr.rankeable.modelo.Usuario;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author edgar
 */

@Controller
public class CadastroUsuarioController {
    
    @RequestMapping("/usuarioform")
    public String usuarioform() {
        return "cadastro-usuario";
    }
    
    @RequestMapping("/cadastroUsuario")
    public String cadastroRankeavel(Usuario usuario, HttpSession session){
        LogicaCadastroUsuario logicaCadastroUsuario = new LogicaCadastroUsuario();
        logicaCadastroUsuario.adicionaUsuario(usuario);     
    
        return "redirect:telaLogin";
    }
    
}
