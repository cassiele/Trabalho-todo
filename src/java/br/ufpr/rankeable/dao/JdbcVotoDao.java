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
import java.sql.ResultSet;
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
        String sql;

        try {
            if (this.jaExisteEsseVoto(voto)) {
                sql = "update voto set voto=voto+1 where id = ?";
                PreparedStatement stmtAtualiza = connection.prepareStatement(sql);
                stmtAtualiza.setInt(1,voto.getId());
                stmtAtualiza.execute();
                stmtAtualiza.close();
            } else {
                sql = "insert into voto " + "(id_categoria, voto, id_rankeavel) " + "values (?,?,?)";  
                PreparedStatement stmtInsere = connection.prepareStatement(sql);
                stmtInsere.setInt(1,voto.getCategoria().getId());
                stmtInsere.setInt(2,voto.getVoto());
                stmtInsere.setInt(3,voto.getRankeavel().getId());
                stmtInsere.execute();
                stmtInsere.close();
            } 

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean jaExisteEsseVoto(Voto voto) {
        String sql = "select * from voto where id_rankeavel = ? and id_categoria = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, voto.getRankeavel().getId());
            stmt.setInt(2, voto.getCategoria().getId());
           
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
              voto.setId(rs.getInt("id"));
              return true;
            } else {
              return false;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }  
}
