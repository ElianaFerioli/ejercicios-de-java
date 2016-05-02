/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen29;

import java.util.ArrayList;

/**
 *
 * @author eliana
 */
public class Ejercicio04Prueba {
    public static void main(String[] args) {
        System.out.println("Este programa genera una secuencia de 6 fichas de dominó.");
        ArrayList<Ficha> domino = new ArrayList<>();
        //Genera la primer ficha
        domino.add(new Ficha());
        
        //Genera las seis fichas sin que se repitan
        int x = 1;
        while(x < 6) {
            Ficha f = new Ficha();
            if(!domino.contains(f)) {
                if(domino.get(x-1).getLadoDer()==f.getLadoIz()) {
                    domino.add(f);
                    x++;
                }
            }
        }
        
        //Las muestra
        for(Ficha f: domino){
            System.out.print(f);
        }
    }
}
