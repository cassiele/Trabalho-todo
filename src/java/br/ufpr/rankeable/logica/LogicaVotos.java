/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.logica;

import br.ufpr.rankeable.dao.CRUDVotoDao;
import br.ufpr.rankeable.modelo.Voto;
import br.ufpr.rankeable.dao.JdbcVotoDao;

/**
 *
 * @author cassiele
 */
public class LogicaVotos implements InsercaoVotos{
    
    private CRUDVotoDao votoDao;

    public LogicaVotos(CRUDVotoDao votoDao) {
        this.votoDao = votoDao;
    }
    

    @Override
    public void InsereVotos(Voto voto) {
        
        votoDao.inserirVotoDao(voto);
        
    }
    
}
