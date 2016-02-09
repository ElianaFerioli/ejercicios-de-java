/*
 * Devuelve verdadero si el número que se pasa como parámetro es primo y
 * falso en caso contrario.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        System.out.println("Devuelve verdadero si el número que se pasa como parámetro es primo y\nfalso en caso contrario.");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        int x = Integer.parseInt(s.nextLine());
        
        if(Varias.esPrimo(x)) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }
    }
}
