/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.ed.pilhas;

import java.util.LinkedList;

/**
 *
 * @author jonathan.silva
 */
public class PilhaGenerica {
    
    private LinkedList<Object> objetos = new LinkedList<Object>();
    
    public void insere(Object objeto){
        this.objetos.add(objeto);
    }
    
    public Object remove(){
        return this.objetos.remove(this.objetos.size() - 1);
    }
    
    public boolean vazia(){
        return this.objetos.size() == 0;
    }
    
}
