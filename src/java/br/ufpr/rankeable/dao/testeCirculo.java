/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.dao;

import br.ufpr.rankeable.modelo.Circulo;
import br.ufpr.rankeable.modelo.Rankeavel;
import br.ufpr.rankeable.jdbc.MysqlConnectionFactory;
import br.ufpr.rankeable.modelo.Categoria;
import br.ufpr.rankeable.modelo.Circulo;
import br.ufpr.rankeable.modelo.Rankeavel;
import br.ufpr.rankeable.modelo.Ranking;
import br.ufpr.rankeable.modelo.Voto;
import java.sql.Connection;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author edgar
 */
public class testeCirculo {
    
    public static void main(String[] args) {
    
        Circulo circulo = new Circulo();
        circulo.setId(1);
        circulo.setNome("Palotina");
        Rankeavel rankeavel = new Rankeavel();
        rankeavel.setId(1);        
        rankeavel.setNome("ogalo");
        rankeavel.setCirculo(circulo);
          
          System.out.println("INICIANDO O TESTE DE CIRCULO ...");
          CRUDCirculo teste = new JdbcCirculoDao();
          System.out.println("Passa 1");
          teste.adiciona(circulo);
          System.out.println("2");
          teste.vincularRankeavel(circulo, rankeavel);
          System.out.println("FINALIZADO !");
          
          teste.desvincularRankeavel(circulo, rankeavel);
    
    }
}
