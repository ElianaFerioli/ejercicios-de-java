/*
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa debe ordenar
 * palabras en lugar de números.
 */
package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio04 {
    public static void main(String[] args) {
         System.out.println("Este programa almacena 10 palabras en un ArrayList y las ordena.");
         ArrayList<String> a = new ArrayList<String>();
         Scanner s = new Scanner(System.in);
         
         //Pide las palabras y las guarda en un ArrayList
         for(int x = 1; x <= 10; x++){
            System.out.print("Por favor, introduzca la " + x + "º palabra: ");
            String i = s.nextLine();
            a.add(i);            
         }
         
         //Muestra el ArrayList en el orden introducido
         System.out.println("Lista original: ");
         System.out.println(a);
         
         //Ordena el ArrayList alfabeticamete
         Collections.sort(a);
         
         //Muestra el nuevo orden
         System.out.println("Lista ordenada: ");
         System.out.println(a);
         
     }    
    
}
