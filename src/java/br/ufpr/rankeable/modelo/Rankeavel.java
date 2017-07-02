/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.modelo;

import java.util.List;

/**
 *
 * @author helio
 */
public class Rankeavel {
    
    private int id;
    private String nome;
    private String urlRedeSocial;
    private String foto;
    private List<Circulo> circulos;
    
    ///getters e setters

    public Rankeavel() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrlRedeSocial() {
        return urlRedeSocial;
    }

    public void setUrlRedeSocial(String urlRedeSocial) {
        this.urlRedeSocial = urlRedeSocial;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
}
