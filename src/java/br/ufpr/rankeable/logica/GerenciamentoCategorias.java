/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.logica;

import br.ufpr.rankeable.dao.CRUDCategoria;
import br.ufpr.rankeable.dao.JdbcCategoriaDao;
import br.ufpr.rankeable.modelo.Categoria;
import java.util.List;

/**
 *
 * @author cassilene
 */
public class GerenciamentoCategorias implements PegaCategorias, CadastroCategorias {
    
    private CRUDCategoria crudCategoria;

    public GerenciamentoCategorias() {
        crudCategoria = new JdbcCategoriaDao();
    }
    
    @Override
    public List<Categoria> listar() {
        
        List<Categoria> categorias = crudCategoria.listar();
        return categorias;
    }

    @Override
    public Categoria pegaCategoria(int id) {
        return crudCategoria.buscaPorId(id);
    }

    @Override
    public void adicionaCategoria(Categoria categoria) {   
        crudCategoria.adiciona(categoria);
    }

    @Override
    public void removeCategoria(Categoria categoria) {
        crudCategoria.remove(categoria);
    }

    @Override
    public void alteraCategoria(Categoria categoria) {
        crudCategoria.altera(categoria);
    }


    
}
