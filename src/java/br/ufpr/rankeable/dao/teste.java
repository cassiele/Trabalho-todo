/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.dao;

import br.ufpr.rankeable.jdbc.MysqlConnectionFactory;
import br.ufpr.rankeable.modelo.Circulo;
import br.ufpr.rankeable.modelo.Rankeavel;
import java.sql.Connection;

/**
 *
 * @author ADILSON
 */
public class teste {
       
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setNome("UFPR");
        
        JdbcCirculoDao circuloDao = new JdbcCirculoDao();
        circuloDao.adiciona(circulo);                
    }    
    
    
}
