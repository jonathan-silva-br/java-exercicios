/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.ed.pilhas;

import br.com.caelum.ed.Peca;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jonathan.silva
 */
public class Pilha {
    
    private LinkedList<Peca> pecas = new LinkedList<Peca>();
    
    public void insere(Peca peca){
        this.pecas.add(peca);
    }
    
    public Peca remove(){
        return this.pecas.remove(this.pecas.size() - 1);
    }
    
    public boolean vazia(){
        return this.pecas.isEmpty();
    }
    
}
