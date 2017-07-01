/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.dao;

import br.ufpr.rankeable.modelo.Voto;

/**
 *
 * @author cassiele
 */
public interface CRUDVoto {
    
    void inserirVoto(Voto voto);
    
    boolean jaExisteEsseVoto(Voto voto);
    
}
