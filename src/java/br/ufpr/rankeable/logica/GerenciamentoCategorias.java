/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.logica;

import br.ufpr.rankeable.dao.CRUDCategoria;
import br.ufpr.rankeable.modelo.Categoria;
import java.util.List;

/**
 *
 * @author cassiele
 */
public class GerenciamentoCategorias implements PegaCategorias, CadastroCategorias {
    
    private CRUDCategoria categoria;
    
    
    
    @Override
    public List<Categoria> listar() {
        
        List<Categoria> categorias = categoria.listar();
        return categorias;
    }

    @Override
    public Categoria pegaCategoria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adicionaCategoria(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeCategoria(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alteraCategoria(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
