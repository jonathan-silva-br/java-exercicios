/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.ed.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jonathan.silva
 */
public class ConjuntoEspalhamento {
    
    private List<List<String>> tabela = new ArrayList<List<String>>();
    
    private int tamanho = 0;
    
    public ConjuntoEspalhamento(){
        for(int i = 0; i < 26; i++){
            LinkedList<String> lista = new LinkedList<String>();
            tabela.add(lista);
        }
    }
    
    private int calculaIndiceDaTabela(String palavra){
        return palavra.toLowerCase().charAt(0) % 26;
    }
    
    public boolean contem(String palavra){
        int indice = this.calculaIndiceDaTabela(palavra);
        List<String> lista = this.tabela.get(indice);
        
        return lista.contains(palavra);
    }
    
    public void adiciona(String palavra){
        if(!this.contem(palavra)){
            int indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            lista.add(palavra);
            this.tamanho++;
        }
    }
    
    public void remove(String palavra){
        if(this.contem(palavra)){
            int indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            lista.remove(palavra);
            this.tamanho--;
        }
    }
    
    public List<String> pegaTodas(){
        List<String> palavras = new ArrayList<String>();
        
        for(int i = 0; i < this.tabela.size(); i++){
            palavras.addAll(this.tabela.get(i));
        }
        
        return palavras;
    }
    
}
