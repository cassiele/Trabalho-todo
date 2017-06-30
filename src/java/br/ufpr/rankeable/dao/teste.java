/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.dao;

import br.ufpr.rankeable.jdbc.MysqlConnectionFactory;
import br.ufpr.rankeable.modelo.Categoria;
import br.ufpr.rankeable.modelo.Circulo;
import br.ufpr.rankeable.modelo.Rankeavel;
import br.ufpr.rankeable.modelo.Voto;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author ADILSON
 */
public class teste {
       
    public static void main(String[] args) {
        
        // Testa cadastro de circulo
//        Circulo circulo = new Circulo();
//        circulo.setNome("CVALE");
//             
//        CRUDCirculo dbCirculo = new JdbcCirculoDao();
//        dbCirculo.adiciona(circulo);  
        
        // Testa inserção de voto
        System.out.println("Iniciando inserção de votos...");
        Categoria categoria = new Categoria();
        categoria.setNome("Inteligência");
        CRUDCategoria dbCategoria = new JdbcCategoriaDao();
        dbCategoria.adiciona(categoria);       
        List<Categoria> categorias = dbCategoria.lista();
        
        
        Rankeavel rankeavel = new Rankeavel();
        rankeavel.setNome("ogalo");
        CRUDRankeavel dbRankeavel = new JdbcRankeavelDao();
        dbRankeavel.adiciona(rankeavel);
        dbRankeavel.buscaPorId(rankeavel.getId());
        
        Voto voto = new Voto(categoria, rankeavel);
        voto.setCategoria(categoria);
        voto.setNota(1);
        voto.setRankeavel(rankeavel);
        CRUDVoto dbVoto = new JdbcVotoDao();
        dbVoto.inserirVoto(voto);       
        
        System.out.println(voto.toString());        
        
        System.out.println("Encerrando inserção de votos...");        
    }    
    
    
}
