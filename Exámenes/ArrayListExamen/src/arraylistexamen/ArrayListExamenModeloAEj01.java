/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexamen;

import static arraylistexamen.ArrayListExamenModeloBEj02.esCapicua;
import java.util.ArrayList;

/**
 *
 * @author eliana
 */
public class ArrayListExamenModeloAEj01 {
    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<Integer>();
        ArrayList<Integer> primo = new ArrayList<Integer>();
        ArrayList<Integer> noPrimo = new ArrayList<Integer>();
        //Rellena el array
        for(int x = 0; x < 40; x++) {
            int i = ((int)(Math.random()*201) + 100);
            original.add(i);
        }
        
        //Manda los que son primos a otro array
        for(int o: original) {
            if(esPrimo(o)) {
                primo.add(o);                
            }
        }
        
        //Manda los que no son primos a otro array
        for(int o: original) {
            if(!esPrimo(o)) {
                noPrimo.add(o);                
            }
        }
        
        //Muestra lista original
        System.out.println("Muestra la lista original: ");
        for(int o: original) {
            System.out.print(o + "/");
        }
        
        //Muestra lista de primos
        System.out.println("\nMuestra la lista de primos: ");
        for(int c: primo) {
            System.out.print(c + "/");
        }
        
        //Muestra lista no primos
        System.out.println("\nMuestra la lista de no primos: ");
        for(int np: noPrimo) {
            System.out.print(np + "/");
        }
    }
        
    /**
    * Devuelve verdadero si el número que se pasa como parámetro es primo y
    * falso en caso contrario.
    *
    * @param num un número entero positivo
    * @return verdadero o falso
    */
    
    //Es primo////////////////////////////////////////////////////////
    public static boolean esPrimo(int num) {
        int x = 1;
        int resto = 0;
        int suma = 0;
        boolean esPrimo = false;

        //Verifica cuántas veces da de resto 0
        do {
          resto = num % x;
          if (resto == 0) {
            suma++;
          }
          x++;
        } while ((x <= num) && (num != 2));

        //Establece si es o no primo
        if ((suma == 2)||(num == 1)) {
            esPrimo = true;
        } 
        return esPrimo;
    }
    
}
    
