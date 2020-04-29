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
public class TestePilhaGenerica {
    public static void main(String[] args) {
        PilhaGenerica pilhaDePecas = new PilhaGenerica();
        
        Peca peca1 = new Peca();
        pilhaDePecas.insere(peca1);
        
        Object pecaRemovida = pilhaDePecas.remove();
        
        if(peca1 != pecaRemovida){
            System.out.println("Erro: a peça removida n]ao é igual a que foi inserida");
        }
        
        if(!pilhaDePecas.vazia()){
            System.out.println("Erro: A pilha não está vazia");
        }
    }
    
}
