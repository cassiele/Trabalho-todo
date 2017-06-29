/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.logica;

import br.ufpr.rankeable.modelo.Circulo;
import br.ufpr.rankeable.modelo.Rankeavel;

/**
 *
 * @author cassiele
 */
public interface CadastroCirculo {
    
    public void adiciona(Circulo circulo);
    public void remove(Circulo circulo);
    public void altera(Circulo circulo);
    public void vincularRankeavel(Circulo circulo, Rankeavel rankeavel);
    public void desvincularRankeavel(Circulo circulo, Rankeavel rankeavel); 
    
}
