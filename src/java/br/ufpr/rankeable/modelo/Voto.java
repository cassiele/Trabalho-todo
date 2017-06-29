/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.modelo;

/**
 *
 * @author cassiele
 */
public class Voto {
    
    private int id;
    private Categoria categoria;
    private int voto;
    private Rankeavel rankeavel;

    public Voto() {
    }

    
    public Voto(Categoria categoria, Rankeavel rankeavel) {
        this.categoria = categoria;
        this.rankeavel = rankeavel;
       
    }

    public int getId() {
        return id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getVoto() {
        return voto;
    }

    public Rankeavel getRankeavel() {
        return rankeavel;
    }
    
    

    public void setId(int id) {
        this.id = id;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setNota(int voto) {
        this.voto = voto;
    }

    public void setRankeavel(Rankeavel rankeavel) {
        this.rankeavel = rankeavel;
    }

    public void inserirVoto(Voto voto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
