/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.dao;

import br.ufpr.rankeable.modelo.Usuario;
import java.sql.SQLException;

/**
 *
 * @author ADILSON
 */
public interface CRUDUsuario {

    boolean existeUsuario(Usuario usuario) throws SQLException;
    void alteraUsuario(Usuario usuario);
    void removeUsuario(Usuario usuario);
}
