/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.dao;

import br.ufpr.rankeable.jdbc.MysqlConnectionFactory;
import br.ufpr.rankeable.modelo.Categoria;
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
public class JdbcCategoriaDao implements CRUDCategoria {
    
     private Connection connection;
    
     public JdbcCategoriaDao() {
        connection = (new MysqlConnectionFactory()).getConnection();
    }

    @Override
    public void adiciona(Categoria categoria) {
        String sql = "insert into categoria " + "(nome) " + "values (?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, categoria.getNome());
           
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    @Override
    public void remove(Categoria categoria) {
        String sql = "delete from categoria where id = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1, categoria.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void altera(Categoria categoria) {
        String sql = "update categoria set nome=? where id = " + categoria.getId();
         
         try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, categoria.getNome());

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
    public Categoria buscaPorId(int id) {
        String sql = "select * from categoria where id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            Categoria categoria = new Categoria();
            
            if (rs.next()) {
                categoria.setId(rs.getInt("id"));
                categoria.setNome(rs.getString("nome"));
            }
            stmt.close();
            return categoria;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    
    public List<Categoria> listar() {
        String sql = "select * from categoria";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Categoria> categorias = new ArrayList<Categoria>();
            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("id"));
                categoria.setNome(rs.getString("nome"));
                categorias.add(categoria);
            }
            stmt.close();
            return categorias;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
