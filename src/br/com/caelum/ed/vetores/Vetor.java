/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;
import java.util.Arrays;

/**
 *
 * @author jonathan.silva
 */
public class Vetor {
    
    private Aluno[] objetos = new Aluno[100000];
    
    private int totalDeObjetos = 0;
    
    public void adiciona(Aluno objetos) {
       this.garantaEspaco();
       this.objetos[this.totalDeObjetos] = objetos;
       this.totalDeObjetos++;
    }
    
    public void adiciona(int posicao, Aluno objetos) {
        this.garantaEspaco();
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = this.totalDeObjetos - 1; i >= posicao; i--) {
            this.objetos[i + 1] = this.objetos[i];
        }
        this.objetos[posicao] = objetos;
        this.totalDeObjetos++;
    }
    
    public Aluno pega(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.objetos[posicao];
    }
    
    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.totalDeObjetos - 1; i++) {
            this.objetos[i] = this.objetos[i + 1];
        }
        this.totalDeObjetos--;
    }
    
    public boolean contem(Aluno objeto) {
        for(int i = 0; i < this.totalDeObjetos; i++){
            if(objeto == this.objetos[i]){
                return true;
            }
        }
        return false;
    }
    
    public int tamanho() {
        return this.totalDeObjetos;
    }
    
    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeObjetos;
    }
    
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.totalDeObjetos;
    }
    
    private void garantaEspaco() {
        if (this.totalDeObjetos == this.objetos.length) {
            Aluno[] novaArray = new Aluno[this.objetos.length * 2];
            for (int i = 0; i < this.objetos.length; i++) {
                novaArray[i] = this.objetos[i];
            }
            this.objetos = novaArray;
        }
    }
    
    public String toString() {
        if (this.totalDeObjetos == 0) {
            return "[]";
        }
        
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        
        for (int i = 0; i < this.totalDeObjetos - 1; i++) {
            builder.append(this.objetos[i]);
            builder.append(", ");
        }
        
        builder.append(this.objetos[this.totalDeObjetos - 1]);
        builder.append("]");
        
        return builder.toString();
    }
}
    

    

