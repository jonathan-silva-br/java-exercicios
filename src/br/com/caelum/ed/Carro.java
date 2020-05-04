/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.ed;

/**
 *
 * @author jonathan.silva
 */
public class Carro {
    
    private String nome;
    
    public Carro(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }

    @Override
    public String toString() {
        return "Carro: " + this.nome;
    }
    
    
    
}
