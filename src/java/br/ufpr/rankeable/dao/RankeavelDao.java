/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.dao;

import br.ufpr.rankeable.jdbc.MysqlConnectionFactory;
import br.ufpr.rankeable.modelo.Rankeavel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author cassiele
 */
public class RankeavelDao {
    
     private Connection connection;
    
     public RankeavelDao() {
        connection = (new MysqlConnectionFactory()).getConnection();
    }
     
    public void adiciona(Rankeavel rankeavel) {
        String sql = "insert into rankeavel " + "(nome, urlRedeSocial, foto) " + "values (?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, rankeavel.getNome());
            stmt.setString(2, rankeavel.getUrlRedeSocial());
            stmt.setString(3, rankeavel.getFoto());
           
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    
     public void remove(Rankeavel rankeavel) {
        String sql = "delete from rankeavel where id = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1, rankeavel.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
     
     
    
}
