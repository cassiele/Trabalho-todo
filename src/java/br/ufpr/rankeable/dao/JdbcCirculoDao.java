/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.dao;

import br.ufpr.rankeable.modelo.Circulo;
import br.ufpr.rankeable.modelo.Rankeavel;
import br.ufpr.rankeable.jdbc.MysqlConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ADILSON
 */
public class JdbcCirculoDao implements CRUDCirculo {
    
    private Connection connection;
    
    public JdbcCirculoDao() {
        connection = (new MysqlConnectionFactory()).getConnection();
    }
    
    @Override
    public void adiciona(Circulo circulo) {
        String sql = "insert into circulo (nome) values (?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, circulo.getNome());
           
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void remove(Circulo circulo) {
        String sql = "delete from circulo where id = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, circulo.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void altera(Circulo circulo) {
        String sql = "update circulo set nome=? where id = " + circulo.getId();
         
         try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, circulo.getNome());

            // executa
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void vincularRankeavel(Circulo circulo, Rankeavel rankeavel) {
        String sql = "insert into rankeavel_circulo (id_circulo, id_rankeavel) values (?, ?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, circulo.getId());
            stmt.setInt(2, rankeavel.getId());
           
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        
    }

    @Override
    public void desvincularRankeavel(Circulo circulo, Rankeavel rankeavel) {
        String sql = "delete from rankeavel_circulo where (id_rankeavel, id_circulo) = (?, ?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, rankeavel.getId());
            stmt.setInt(2, circulo.getId());
            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        
        rankeavel.unSetCirculo(circulo);
        
        
    }
    
    
}
