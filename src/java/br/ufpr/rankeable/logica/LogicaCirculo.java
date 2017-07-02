/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.logica;

import br.ufpr.rankeable.dao.CRUDCirculo;
import br.ufpr.rankeable.modelo.Circulo;
import br.ufpr.rankeable.modelo.Rankeavel;

/**
 *
 * @author cassiele
 */
public class LogicaCirculo implements CadastroCirculo {

    private CRUDCirculo crudCirculo;
    
    public LogicaCirculo(CRUDCirculo circulo){
        this.crudCirculo = circulo;
    }
    
    @Override
    public void adiciona(Circulo circulo) {
        crudCirculo.adiciona(circulo);
    }

    @Override
    public void remove(Circulo circulo) {
        crudCirculo.remove(circulo);
    }

    @Override
    public void altera(Circulo circulo) {
        crudCirculo.altera(circulo);
    }

    @Override
    public void vincularRankeavel(Circulo circulo, Rankeavel rankeavel) {
        crudCirculo.vincularRankeavel(circulo, rankeavel);
    }

    @Override
    public void desvincularRankeavel(Circulo circulo, Rankeavel rankeavel) {
        crudCirculo.desvincularRankeavel(circulo, rankeavel);
    }
    
}
