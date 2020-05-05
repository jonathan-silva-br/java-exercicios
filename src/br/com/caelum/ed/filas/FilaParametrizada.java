/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.ed.filas;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jonathan.silva
 */
public class FilaParametrizada<T> {
    
    private List<T> objetos = new LinkedList<T>();    
        
    public void insere(T objeto){
        this.objetos.add(objeto);
    }
    
    public T remove(){
        return this.objetos.remove(0);
    }
    
    public boolean vazia(){
        return this.objetos.isEmpty();
    }
}
