/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.ed.pilhas;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.filas.FilaParametrizada;

/**
 *
 * @author jonathan.silva
 */
public class TesteFilaGenerica {
    public static void main(String[] args){
        
        FilaParametrizada<Aluno> filaDeAlunos = new FilaParametrizada<Aluno>();
        
        Aluno aluno = new Aluno();
        filaDeAlunos.insere(aluno);
        
        Aluno alunoRemovido = filaDeAlunos.remove();
        
        if(aluno != alunoRemovido){
            System.out.println("Erro: o aluno removido não é igual ao que foi inserido");
        }
        
        if(!filaDeAlunos.vazia()){
            System.out.println("Erro: a fila não está vazia");
        }
        
        FilaParametrizada<String> filaDeString = new FilaParametrizada<String>();
        
        filaDeString.insere("Diana");
        filaDeString.insere("Joaquim");
        
        System.out.println(filaDeString.remove());
        System.out.println(filaDeString.remove());
                
                
    }
    
}
