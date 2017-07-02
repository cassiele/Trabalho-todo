/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.dao;

import br.ufpr.rankeable.modelo.Categoria;
import java.util.List;

/**
 *
 * @author cassiele
 */
public interface CRUDCategoria {
    public void adiciona(Categoria categoria);
    public void remove(Categoria categoria);
    public void altera(Categoria categoria);
    public Categoria buscaPorId(int id);
    public List<Categoria> listar();
}
