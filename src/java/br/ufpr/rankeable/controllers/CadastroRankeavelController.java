/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.controllers;

import br.ufpr.rankeable.dao.JdbcRankeavelDao;
import br.ufpr.rankeable.dao.JdbcUsuarioDao;
import br.ufpr.rankeable.logica.LogicaCadastroRankeavel;
import br.ufpr.rankeable.modelo.Rankeavel;
import br.ufpr.rankeable.modelo.Usuario;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author edgar
 */
@Controller
public class CadastroRankeavelController {
        
    @RequestMapping("/rankeavelform")
    public String rankeavelform() {
  
        return "cadastro-rankeavel";
    }
    
    @RequestMapping("/cadastroRankeavel")
    public String cadastroRankeavel(Rankeavel rankeavel, HttpSession session){
        LogicaCadastroRankeavel logicaCadastroRankeavel = new LogicaCadastroRankeavel();
        logicaCadastroRankeavel.adicionaRankeavel(rankeavel);
    
        return "redirect:telaVotacao";
    }
    
}
