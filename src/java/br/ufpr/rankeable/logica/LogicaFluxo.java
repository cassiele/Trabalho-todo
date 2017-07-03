/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.logica;

import br.ufpr.rankeable.dao.CRUDRankeavel;
import br.ufpr.rankeable.dao.JdbcRankeavelDao;
import br.ufpr.rankeable.modelo.Rankeavel;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author cassi
 */
public class LogicaFluxo implements Navegacao {

    private PegaRankeaveis pegadorDeRankeavel;
    private LinkedList<Rankeavel> historico;
    private Rankeavel atual;

    public LogicaFluxo() {
        historico = new LinkedList<Rankeavel>();
        pegadorDeRankeavel = new LogicaCadastroRankeavel();
    }
 
    @Override
    public Rankeavel getProximo() {

        Random random = new Random();
        int idRandomico;
        historico.addFirst(atual);
        List<Rankeavel> rankeaveis = (List<Rankeavel>) pegadorDeRankeavel.getRankeaveis();
        idRandomico = random.nextInt(rankeaveis.size());
         atual = rankeaveis.get(idRandomico);   
        return atual;
    }

    @Override
    public Rankeavel getAnterior() {

        atual = historico.getFirst();
        historico.removeFirst();
        return atual;
    }

}
