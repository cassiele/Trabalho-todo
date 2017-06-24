/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.dao;

import br.ufpr.rankeable.modelo.Circulo;
import br.ufpr.rankeable.modelo.Rankeavel;

/**
 *
 * @author ADILSON
 */
public interface CRUDCirculo {
    public void adiciona(Circulo circulo);
    public void remove(Circulo circulo);
    public void altera(Circulo circulo);
    public void vincularRankeavel(Circulo circulo, Rankeavel rankeavel);
    public void desvincularRankeavel(Circulo circulo, Rankeavel rankeavel);    
}
