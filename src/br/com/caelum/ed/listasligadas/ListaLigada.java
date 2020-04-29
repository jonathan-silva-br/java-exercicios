/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.ed.listasligadas;

/**
 *
 * @author jonathan.silva
 */
public class ListaLigada {
    
    private Celula primeira;
    
    private Celula ultima;
    
    private int totalDeElementos;
    
    public void adiciona(Object elemento){
        
    }
    
    public void adiciona(int posicao, Object elemento){
        
    } 
    
    public Object pega(int posicao){
        return null;
    }
    
    public void remove(int posicao){
        
    }
    
    public int tamanho(){
        return 0;
    }
    
    public boolean contem(Object elemento){
        return false;
    } 
    
    public void adicionaNoComeco(Object elemento){
        
    }
    
    public void removeDoComeco(){
        
    }
    
    public void removeDoFim(){
        
    }

    @Override
    public String toString() {
        
        if(this.totalDeElementos == 0){
            return "[]";
        }
        
        StringBuilder builder = new StringBuilder("[");
        Celula atual = primeira;
        
        for(int i = 0; i < this.totalDeElementos - 1; i++){
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProxima();
        }
        
        builder.append(atual.getElemento());
        builder.append("]");
        
        return builder.toString();     
        
    }
    
    
}
