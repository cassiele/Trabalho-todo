/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.controllers;

import br.ufpr.rankeable.dao.GeraRanking;
import br.ufpr.rankeable.dao.JdbcRankingDao;
import br.ufpr.rankeable.dao.JdbcUsuarioDao;
import br.ufpr.rankeable.logica.CadastroCategorias;
import br.ufpr.rankeable.logica.GerenciamentoCategorias;
import br.ufpr.rankeable.logica.LogicaRanking;
import br.ufpr.rankeable.logica.Rankear;
import br.ufpr.rankeable.modelo.Categoria;
import br.ufpr.rankeable.modelo.Ranking;
import br.ufpr.rankeable.modelo.Usuario;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author lucas
 */
@Controller
public class RankingCrontroller {

    @RequestMapping("/Top10")
    public String listar(Categoria categoria, Model model, HttpSession session) {
        Rankear top10 = new LogicaRanking();
        List<Ranking> ranking = top10.Top10(categoria.getId());
        model.addAttribute("ranking", ranking);
        session.setAttribute("CategoriaNome", categoria.getNome());
        return "ranking";
    }

    @RequestMapping("/RankingList")
    public String escolheCategoria(Model model){
        CadastroCategorias dbCategoria = new GerenciamentoCategorias(); 
        List<Categoria> categorias = dbCategoria.listar();
        model.addAttribute("categorias", categorias );
        return "/rankinglist";

    }

}
