/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.controllers;

import br.ufpr.rankeable.dao.CRUDCategoria;
import br.ufpr.rankeable.dao.CRUDVoto;
import br.ufpr.rankeable.dao.JdbcCategoriaDao;
import br.ufpr.rankeable.dao.JdbcVotoDao;
import br.ufpr.rankeable.logica.CadastroCategorias;
import br.ufpr.rankeable.logica.GerenciamentoCategorias;
import br.ufpr.rankeable.logica.LogicaVotos;
import br.ufpr.rankeable.logica.Navegacao;
import br.ufpr.rankeable.modelo.Categoria;
import br.ufpr.rankeable.modelo.Rankeavel;
import br.ufpr.rankeable.modelo.Voto;
import java.util.List;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author helio
 */
@Controller
public class VotacaoController {

    //Navegacao navegacao;  //"setado" por injeção de dependência
    
    public VotacaoController() {
        
    }
    public VotacaoController(Navegacao navegacao) {
        
    }
     
    @RequestMapping("/telaVotacao")
    public String telaVotacao(Model model){
        
       //Rankeavel rankeavel = navegacao.getProximo();
        //model.addAttribute("rankeavel", rankeavel);
        
        CadastroCategorias dbCategoria = new GerenciamentoCategorias();  
      //  CRUDCategoria dbCategoria = new JdbcCategoriaDao();
        //dbCategoria.adiciona(categoria);
        List<Categoria> categorias = dbCategoria.listar();
        model.addAttribute("categorias", categorias );

       // List<Categoria> categorias = pegaCategorias.getCategorias();
       // model.addAttribute("categorias",categorias);
        
        return "Votacao/tela-principal";
    }
       
    @RequestMapping("/insereVoto")
    public String insereVoto(Categoria categoria) {
//    public String insereVoto() {        

        Rankeavel rankeavel = new Rankeavel();
        rankeavel.setId(1);
        rankeavel.setNome("Cassi");

    //    Categoria categoria = new Categoria();
    //    categoria.setId(8);
     //   categoria.setNome("teste");
        
        Voto voto = new Voto(categoria, rankeavel);
        voto.setVoto(1);
        voto.setCategoria(categoria);
        voto.setRankeavel(rankeavel);
        
        CRUDVoto dbVoto = new JdbcVotoDao();
        dbVoto.inserirVoto(voto);          
                
//        LogicaVotos logicaVotos = new LogicaVotos(voto);
//        logicaVotos.InsereVoto(voto);

        return "redirect:telaVotacao";
    }
    
    
    
}
