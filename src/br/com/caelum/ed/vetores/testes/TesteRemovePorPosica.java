/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Object;
import br.com.caelum.ed.vetores.Vetor;

/**
 *
 * @author jonathan.silva
 */
public class TesteRemovePorPosica {
    public static void main(String[] args) {
        Object a1 = new Object();
        Object a2 = new Object();
        
        a1.setNome("Rafael");
        a2.setNome("Paulo");
        
        Vetor lista = new Vetor();
        
        lista.adiciona(a1);
        lista.adiciona(a2);
        
        lista.remove(0);
        
        System.out.println(lista);
}
    
}
