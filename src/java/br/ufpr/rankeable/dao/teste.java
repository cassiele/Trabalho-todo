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
        
        // Testa cadastro de circulo
        Circulo circulo = new Circulo();
        circulo.setNome("CVALE");
             
        CRUDCirculo dbCirculo = new JdbcCirculoDao();
        dbCirculo.adiciona(circulo);                
    }    
    
    
}
