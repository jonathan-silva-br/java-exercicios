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
        ConjuntoEspalhamentoGenerico conjunto = new ConjuntoEspalhamentoGenerico();
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");
        
        List<Object> palavras = conjunto.pegaTodas();
        
        for(Object palavra : palavras){
            System.out.println(palavra);
        }
    }
    
}
