/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.dao;

import br.ufpr.rankeable.modelo.Rankeavel;
import java.util.List;

/**
 *
 * @author ADILSON
 */
public interface CRUDRankeavel {

    void adiciona(Rankeavel rankeavel);

    void remove(Rankeavel rankeavel);

    public Rankeavel buscaPorId(int id);
    
    List<Rankeavel> getRankeaveis();
    
    
}
