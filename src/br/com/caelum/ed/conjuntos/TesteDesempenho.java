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
public class TesteDesempenho {
    public static void main(String[] args) {
        
        long inicio = System.currentTimeMillis();
        
        ConjuntoEspalhamentoGenerico conjunto = new ConjuntoEspalhamentoGenerico();
        
        for (int i = 0; i < 50000; i++){
            conjunto.adiciona("palavra" + i);
        }
        
        for (int i = 0; i < 50000; i++){
            conjunto.contem("palavra" + i);
        }
        
        long fim = System.currentTimeMillis();
        
        System.out.println("Tempo: " + (fim - inicio) / 1000.0);
        
    }
    
}
