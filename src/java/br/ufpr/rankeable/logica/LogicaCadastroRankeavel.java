/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.logica;

import br.ufpr.rankeable.dao.CRUDRankeavel;
import br.ufpr.rankeable.dao.JdbcRankeavelDao;
import br.ufpr.rankeable.modelo.Circulo;
import br.ufpr.rankeable.modelo.Rankeavel;
import java.util.List;

/**
 *
 * @author cassiele
 */
public class LogicaCadastroRankeavel implements PegaRankeaveis,SolicitarRemocao,CadastroRankeavel{

    private CRUDRankeavel crudrankeavel;
    

    public LogicaCadastroRankeavel() {
       crudrankeavel = new JdbcRankeavelDao();
    }
    
    
    
    @Override
    public List<Rankeavel> getRankeaveis() { 
        return crudrankeavel.getRankeaveis();     
    }

    @Override
    public void adicionaRankeavel(Rankeavel rankeavel) {
        crudrankeavel.adiciona(rankeavel);
    }

    @Override
    public void removeRankeavel(Rankeavel rankeavel) {
        crudrankeavel.remove(rankeavel);
    }

    
    //Não feito no Dao ainda
    @Override
    public void alterarRankeavel(Rankeavel rankeavel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void solicitaRemocao(Rankeavel rankeavel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
