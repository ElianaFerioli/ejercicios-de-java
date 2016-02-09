/*
 * Le da la vuelta a un número.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        System.out.println("Le da la vuelta a un número.");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        int num = Integer.parseInt(s.nextLine());

        System.out.print("El número al revés es: ");
        System.out.println(Varias.vuelta(num));
    }
    
}
