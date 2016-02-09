/*
 * Devuelve el dígito que está en la posición n de un número entero. Se
 * empieza contando por el 0 y de izquierda a derecha.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Devuelve el dígito que está en la posición n de un número entero. Se\nempieza contando por el 0 y de izquierda a derecha.");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        int x = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca la posición que desea saber: ");
        int p = Integer.parseInt(s.nextLine());
        
        System.out.print("El número de esa posición es: ");
        System.out.println(funciones.Varias.digitoN(x, p));
    }
    
}
