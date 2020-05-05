/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.ed.mapas;

/**
 *
 * @author jonathan.silva
 */
public class AssociacaoParametrizada<C, V> {
    
    private C chave;
    private V valor;
    
    public AssociacaoParametrizada(C chave, V valor){
        this.chave = chave;
        this.valor = valor;
    }
    
    public C getChave(){
        return chave;
    }
    
    public V getValor(){
        return valor;
    }

    @Override
    public String toString() {
        return "{ " + chave + " -> " + valor + " }";
    }
    
    
    
}
