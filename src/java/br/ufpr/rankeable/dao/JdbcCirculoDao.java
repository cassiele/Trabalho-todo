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
    
    @Override
    public void adiciona(Circulo circulo) {
        String sql = "insert into circulo " + "(nome) " + "values (?)";

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
            stmt.setLong(1, circulo.getId());
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desvincularRankeavel(Circulo circulo, Rankeavel rankeavel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
