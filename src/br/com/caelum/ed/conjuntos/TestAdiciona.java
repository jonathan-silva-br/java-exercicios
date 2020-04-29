/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.ed.conjuntos;

import java.util.List;

/**
 *
 * @author jonathan.silva
 */
public class TestAdiciona {
    public static void main(String[] args){
        ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");
        
        List<String> palavras = conjunto.pegaTodas();
        
        for(String palavra : palavras){
            System.out.println(palavra);
        }
    }
    
}
