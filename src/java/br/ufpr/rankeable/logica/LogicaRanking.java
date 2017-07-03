/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.logica;

import br.ufpr.rankeable.dao.GeraRanking;
import br.ufpr.rankeable.dao.JdbcRankingDao;
import br.ufpr.rankeable.modelo.Rankeavel;
import br.ufpr.rankeable.modelo.Ranking;
import java.util.List;

/**
 *
 * @author cassiele
 */
public class LogicaRanking implements Rankear{
    
    GeraRanking rankear;

    public LogicaRanking() {
        rankear = new JdbcRankingDao();
    }

    @Override
    public List<Ranking> Top10(int id) {
        return rankear.pegarTop10(id);
    }
    
}
