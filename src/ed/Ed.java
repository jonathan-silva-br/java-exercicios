/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

import br.com.caelum.ed.Object;
import br.com.caelum.ed.vetores.Vetor;
import java.util.ArrayList;

/**
 *
 * @author jonathan.silva
 */
public class Ed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vetor listaAlunos = new Vetor();
        
        System.out.println("Tamanho da Lista de Alunos usando classe Vetor: " + listaAlunos.tamanho());
                
        for(int x = 0; x < 1000; x++){
            Object aluno = new Object();
            listaAlunos.adiciona(aluno);
        }
        
        System.out.println("Tamanho da Lista de Alunos usando classe Vetor: " + listaAlunos.tamanho());    
        
        ArrayList listaDeAlunos = new ArrayList();
        
        System.out.println("Tamanho da Lista de Alunos usando ArrayList: " + listaDeAlunos.size()); 
        
        for(int x = 0; x < listaAlunos.tamanho(); x++){
            listaDeAlunos.add(listaAlunos.pega(x));
        }
        
        System.out.println("Tamanho da Lista de Alunos usando ArrayList: " + listaDeAlunos.size()); 
        
        
        
        
    }
    
}


