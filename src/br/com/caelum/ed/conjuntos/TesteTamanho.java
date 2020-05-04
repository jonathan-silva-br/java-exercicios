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
public class TesteTamanho {
    public static void main(String[] args) {
        
        ConjuntoEspalhamentoGenerico tabelas = new ConjuntoEspalhamentoGenerico();
        
        tabelas.adiciona("Bruna");
        tabelas.adiciona("Jonathan");
        tabelas.adiciona("Julia");
        
        System.out.println(tabelas.tamanho());
        
        tabelas.adiciona("Jonathan");
        
        System.out.println(tabelas.tamanho());
        
    }
    
}
