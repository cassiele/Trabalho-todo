/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.dao;

import br.ufpr.rankeable.jdbc.MysqlConnectionFactory;
import br.ufpr.rankeable.modelo.Voto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author cassiele
 */
public class JdbcVotoDao implements CRUDVoto {
    
    private Connection connection;
    
     public JdbcVotoDao() {
        connection = (new MysqlConnectionFactory()).getConnection();
    }

    @Override
    public void inserirVoto(Voto voto) {
        String sql = "insert into voto " + "(id_categoria, id_rankeavel, voto) " + "values (?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, voto.getCategoria().getId());
            stmt.setInt(2, voto.getRankeavel().getId());
            stmt.setInt(3, voto.getVoto());            
            
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
