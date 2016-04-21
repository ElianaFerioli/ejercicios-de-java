/*
 * Escribe un programa que ordene 10 números enteros introducidos por teclado y almacena-
 * dos en un objeto de la clase ArrayList .
 */
package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio03 {
     public static void main(String[] args) {
         System.out.println("Este programa almacena 10 números en un ArrayList y los ordena.");
         ArrayList<Integer> a = new ArrayList<Integer>();
         Scanner s = new Scanner(System.in);
         
         //Pide los números y los guarda en un ArrayList
         for(int x = 1; x <= 10; x++){
            System.out.print("Por favor, introduzca el " + x + "º número: ");
            int i = Integer.parseInt(s.nextLine());
            a.add(i);            
         }
         
         //Muestra el ArrayList en el orden introducido
         System.out.println("Lista original: ");
         System.out.println(a);
         
         //Ordena el ArrayList de menor a mayor
         Collections.sort(a);
         
         //Muestra el nuevo orden
         System.out.println("Lista ordenada: ");
         System.out.println(a);
         
     }    
}
