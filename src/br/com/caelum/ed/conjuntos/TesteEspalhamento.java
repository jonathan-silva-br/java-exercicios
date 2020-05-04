/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.ed.conjuntos;

/**
 *
 * @author jonathan.silva
 */
public class TesteEspalhamento {
    public static void main(String[] args) {
        
        ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
        
        for (int i = 0; i < 100; i++){
            conjunto.adiciona("" + i);
        }
        
        conjunto.imprimeTabela();
        
    }
    
}
