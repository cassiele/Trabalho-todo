/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.logica;

import br.ufpr.rankeable.dao.CRUDUsuario;
import br.ufpr.rankeable.dao.JdbcUsuarioDao;
import br.ufpr.rankeable.modelo.Usuario;

/**
 *
 * @author edgar
 */
public class LogicaCadastroUsuario implements CadastroUsuario{

    private CRUDUsuario crudusuario;

    public LogicaCadastroUsuario(){
        crudusuario = new JdbcUsuarioDao();
    }
    
    @Override
    public void adicionaUsuario(Usuario usuario){
        
    }

    @Override
    public void removeUsuario(Usuario usuario){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alteraUsuario(Usuario usuario){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
