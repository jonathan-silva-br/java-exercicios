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
public class TesteContem {
    public static void main(String[] args){
        
        ConjuntoEspalhamento tabelas = new ConjuntoEspalhamento();
        
        tabelas.adiciona("Jonathan");
        tabelas.adiciona("Bruna");
        
        System.out.println(tabelas.contem("Julia"));
        System.out.println(tabelas.contem("Jonathan"));
        
        
    }
    
}
