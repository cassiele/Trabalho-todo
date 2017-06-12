/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.controllers;


import br.ufpr.rankeable.logica.Navegacao;
import br.ufpr.rankeable.logica.PegaCategoria;
import br.ufpr.rankeable.modelo.Rankeavel;
import br.ufpr.rankeable.modelo.Categoria;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author helio
 */
@Controller
public class VotacaoController {

    Navegacao navegacao;  //"setado" por injeção de dependência
    PegaCategoria pegaCategoria;
    
    public VotacaoController() {
        
    }
    
    public VotacaoController(Navegacao navegacao) {
    }
    
    
    
    @RequestMapping("/telaVotacao")
    public String telaVotacao(Model model){
        
        Rankeavel rankeavel = navegacao.getProximo();
        model.addAttribute("rankeavel", rankeavel);
        
        Iterable<Categoria> categorias = pegaCategoria.getCategorias();
        model.addAttribute("categorias",categorias);
        
        return "tela-principal";
    }
    
    
}
