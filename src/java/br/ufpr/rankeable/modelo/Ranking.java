/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.modelo;

/**
 *
 * @author lucas
 */
public class Ranking {

    private String nome;
    private int voto;
    private String rank;
    private String url;
    private String foto;

    public String getNome() {
        return nome;
    }

    public int getVoto() {
        return voto;
    }

    public String getRank() {
        return rank;
    }
    
    public String getFoto() {
        return foto;
    }
     public String getUrl() {
        return url;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
}
 
