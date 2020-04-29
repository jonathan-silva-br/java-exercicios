/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.ed.pilhas;

import br.com.caelum.ed.Peca;

/**
 *
 * @author jonathan.silva
 */
public class Teste {
    public static void main(String[] args){
        
        Pilha pilha = new Pilha();
        
        Peca peca = new Peca();
        pilha.insere(peca);
        
        Peca pecaRemovida = pilha.remove();
        
        if(peca != pecaRemovida){
            System.out.println("Erro: a peça removida não é igual a que foi inserida");
        }
        
        if(!pilha.vazia()){
            System.out.println("Erro: A pilha não está vazia");
        }       
    }
    
}
