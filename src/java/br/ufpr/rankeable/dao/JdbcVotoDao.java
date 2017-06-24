/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.dao;

import br.ufpr.rankeable.jdbc.MysqlConnectionFactory;
import br.ufpr.rankeable.modelo.Voto;
import java.sql.Connection;

/**
 *
 * @author cassiele
 */
public class JdbcVotoDao implements VotoDao {
    
    private Connection connection;
    
     public JdbcVotoDao() {
        connection = (new MysqlConnectionFactory()).getConnection();
    }

    @Override
    public void adiciona(Voto voto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     
}
