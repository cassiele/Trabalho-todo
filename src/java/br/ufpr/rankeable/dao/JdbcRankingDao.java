/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.dao;

import br.ufpr.rankeable.jdbc.MysqlConnectionFactory;
import br.ufpr.rankeable.modelo.Ranking;
import br.ufpr.rankeable.modelo.Voto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cassiele
 */
public class JdbcRankingDao implements GeraRanking {
    
     private Connection connection;
    
     public JdbcRankingDao() {
        connection = (new MysqlConnectionFactory()).getConnection();
    }

    @Override
    public List<Ranking> pegarTop10(int id) {
        String sql = "SELECT categoria.nome, voto.voto, rankeavel.nome as rank, rankeavel.foto as foto, rankeavel.urlRedeSocial from voto inner join rankeavel ON rankeavel.id = voto.id_rankeavel inner join categoria on categoria.id = voto.id_categoria WHERE id_categoria = ? AND voto <= (SELECT max(voto) FROM voto) ORDER BY voto DESC LIMIT 10;";        
        List<Ranking> top10 = new ArrayList<>(); 
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1,id);
                       
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){            
            Ranking ranking = new Ranking();
            ranking.setNome(rs.getString("nome"));
            ranking.setVoto(rs.getInt("voto"));
            ranking.setRank(rs.getString("rank"));
            top10.add(ranking);
                // Existe o usuario  
             }            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return top10;
    }

    }
     
   
