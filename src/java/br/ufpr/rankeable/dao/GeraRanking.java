/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.dao;

import br.ufpr.rankeable.modelo.Ranking;
import java.util.List;

/**
 *
 * @author cassiele
 */
public interface GeraRanking {
    List<Ranking> pegarTop10(int id);   
    
}
