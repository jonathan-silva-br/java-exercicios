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
public class Aluno {
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
    public boolean equals(Object o){
        return this.nome.equals(o.getNome());
    }
    
    
    
}
