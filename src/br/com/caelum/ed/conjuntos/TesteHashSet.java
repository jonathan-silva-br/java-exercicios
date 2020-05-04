/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.ed.conjuntos;

import java.util.HashSet;

/**
 *
 * @author jonathan.silva
 */
public class TesteHashSet {
    public static void main(String[] args) {
        
        HashSet conjunto = new HashSet();
        conjunto.add("Rafael");
        conjunto.add("Rafael");
        conjunto.add("Ana");
        conjunto.add("Paulo");
        
        System.out.println(conjunto);
        
    }
    
}
