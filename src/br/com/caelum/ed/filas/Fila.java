/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.ed.filas;

import br.com.caelum.ed.Aluno;
import java.util.LinkedList;

/**
 *
 * @author jonathan.silva
 */
public class Fila {
    
    
    private LinkedList<Aluno> alunos = new LinkedList<Aluno>();
    
    public void insere(Aluno aluno){
        this.alunos.add(aluno);
    }
    
    public Aluno remove(){
        return this.alunos.remove(0);
    }
    
    public boolean vazia(){
        return this.alunos.isEmpty();
    }
    
}
