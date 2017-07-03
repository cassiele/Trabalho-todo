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
import br.ufpr.rankeable.logica.LogicaFluxo;
import br.ufpr.rankeable.logica.LogicaVotos;
import br.ufpr.rankeable.logica.Navegacao;
import br.ufpr.rankeable.modelo.Categoria;
import br.ufpr.rankeable.modelo.Rankeavel;
import br.ufpr.rankeable.modelo.Voto;
import java.util.List;
import javax.servlet.http.HttpSession;
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

    Navegacao navegacao = new LogicaFluxo();
    Rankeavel rankeavel;

    public VotacaoController() {

    }

    public VotacaoController(Navegacao navegacao) {

    }

    @RequestMapping("/telaVotacao")
    public String telaVotacao(Model model) {
        CadastroCategorias dbCategoria = new GerenciamentoCategorias();
        List<Categoria> categorias = dbCategoria.listar();
        model.addAttribute("categorias", categorias);
        return "Votacao/tela-principal";
    }

    @RequestMapping("/insereVoto")
    public String insereVoto(Categoria categoria, HttpSession session) {
        Rankeavel rankeval = new Rankeavel();
        rankeavel.setId((int) session.getAttribute("id_rankeavel"));
        rankeavel.setNome((String) session.getAttribute("nome_rankeavel"));
        Voto voto = new Voto(categoria, rankeavel);
        voto.setVoto(1);
        voto.setCategoria(categoria);
        voto.setRankeavel(rankeavel);

        CRUDVoto dbVoto = new JdbcVotoDao();
        dbVoto.inserirVoto(voto);
        return "redirect:telaVotacao";
    }

    @RequestMapping("/getRandom")
    public String getRandom(HttpSession session) {
        rankeavel = navegacao.getProximo();
        session.setAttribute("id_rankeavel", rankeavel.getId());
        session.setAttribute("nome_rankeavel", rankeavel.getNome());
        session.setAttribute("url_rankeavel", rankeavel.getUrlRedeSocial());
        return "redirect:telaVotacao";
    }

    @RequestMapping("/getBack")
    public String getBack(HttpSession session) {
        rankeavel = navegacao.getAnterior();
        session.setAttribute("id_rankeavel", rankeavel.getId());
        session.setAttribute("nome_rankeavel", rankeavel.getNome());
        session.setAttribute("url_rankeavel", rankeavel.getUrlRedeSocial());
        return "redirect:telaVotacao";
    }

}
