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
public class PilhaParametrizada {
    
    private LinkedList<T> objetos = new LinkedList<T>();
    
    public void insere(T t){
        this.objetos.add(t);
    }
    
    public T remove(){
        return this.objetos.remove(this.objetos.size() - 1);
    }
    
    public boolean vazia(){
        return this.objetos.isEmpty();
    }
    
    
}
