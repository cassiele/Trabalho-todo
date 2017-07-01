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
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cassiele
 */
public class JdbcRankeavelDao implements CRUDRankeavel {
    
     private Connection connection;
    
     public JdbcRankeavelDao() {
        connection = (new MysqlConnectionFactory()).getConnection();
    }
     
    @Override
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
    
    @Override
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

    @Override
    public Rankeavel buscaPorId(int id) {    
        String sql = "select * from rankeavel where id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            Rankeavel rankeavel = new Rankeavel();
            
            if (rs.next()) {
                rankeavel.setId(rs.getInt("id"));
                rankeavel.setNome(rs.getString("nome"));
            }
            stmt.close();
            return rankeavel;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public Rankeavel getCRUDRankeavel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

