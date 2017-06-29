/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.logica;

import br.ufpr.rankeable.modelo.Circulo;
import br.ufpr.rankeable.modelo.Rankeavel;
import br.ufpr.rankeable.dao.CRUDCirculo;
import br.ufpr.rankeable.dao.JdbcCirculoDao;

/**
 *
 * @author ADILSON
 */
public class LogicaCirculo implements CadastroCirculo {

    private CRUDCirculo circulo;
 
    public LogicaCirculo(CRUDCirculo circulo) {
        this.circulo = circulo;
    }
    
    public void Adiciona(Circulo circulo) {
        adiciona(circulo);
    }    
    
        
    @Override
    public void adiciona(Circulo circulo) {
        
    }

    @Override
    public void remove(Circulo circulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void altera(Circulo circulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vincularRankeavel(Circulo circulo, Rankeavel rankeavel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desvincularRankeavel(Circulo circulo, Rankeavel rankeavel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
