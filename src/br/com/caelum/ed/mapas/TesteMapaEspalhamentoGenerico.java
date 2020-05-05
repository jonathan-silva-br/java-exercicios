/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.ed.mapas;

import br.com.caelum.ed.Carro;

/**
 *
 * @author jonathan.silva
 */
public class TesteMapaEspalhamentoGenerico {
     public static void main(String[] args) {
         
         MapaEspalhamentoGenerico<String, Carro> mapa = new MapaEspalhamentoGenerico<String, Carro>();
         
         mapa.adiciona("abc123", new Carro("Ferrari"));
         mapa.adiciona("def456", new Carro("BMW"));
         
         mapa.contemChave("abc123");
         
         mapa.pega("def456");
         
              
         System.out.println(mapa);
         
         mapa.remove("abc123");
         
         System.out.println(mapa);
         
     }
    
}
