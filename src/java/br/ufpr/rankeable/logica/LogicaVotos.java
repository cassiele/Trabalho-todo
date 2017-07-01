/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.logica;

import br.ufpr.rankeable.modelo.Voto;
import br.ufpr.rankeable.dao.JdbcVotoDao;
import br.ufpr.rankeable.dao.CRUDVoto;

/**
 *
 * @author cassiele
 */
public class LogicaVotos implements InsercaoVotos{
    
    private CRUDVoto crudVoto;

    public LogicaVotos(CRUDVoto voto) {
        this.crudVoto = voto;
    }
    

    @Override
    public void InsereVoto(Voto voto) {        
        crudVoto.inserirVoto(voto);        
    }
    
}
