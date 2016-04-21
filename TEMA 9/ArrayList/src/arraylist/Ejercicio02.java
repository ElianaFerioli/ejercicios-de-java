/*
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un ArrayList y
 * que luego calcule la suma, la media, el máximo y el mínimo de esos números. El tamaño
 * de la lista también será aleatorio y podrá oscilar entre 10 y 20 elementos ambos inclusive.
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author eliana
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        System.out.println("Este programa genera un ArrayList aleatorio y realiza operaciones con sus valores.");
        ArrayList<Integer> a = new ArrayList<Integer>();
        int suma = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        //Genera Aleatoriamente la longitud del array
        int x = (int)(Math.random()*11) + 10;
        
        //Introduce número al ArrayList y calcula suma, máximo y mínimo
        for(int i = 0; i < x; i++){
            a.add((int)(Math.random()*101));
            if(a.get(i) < min) {
                min = a.get(i);
            }
            if(a.get(i) > max) {
                max = a.get(i);
            }
            suma = suma + a.get(i);
        }
        
        //Muestra el array y las operaciones
        System.out.println("Este es el contenido del ArrayList: ");
        for(int i: a){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Esta es la suma: " + suma);
        System.out.println("Este es el máximo: " + max);
        System.out.println("Este es el mínimo: " + min);
        System.out.println("Esta es la media: " + (double)suma / (double)x);     
    }    
}
