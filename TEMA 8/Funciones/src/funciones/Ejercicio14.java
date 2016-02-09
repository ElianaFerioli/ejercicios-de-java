/*
 * Pega dos números para formar uno.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Pega dos números para formar uno.");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        int x = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca otro: ");
        int p = Integer.parseInt(s.nextLine());
        
        System.out.print("El número resultante es: ");
        System.out.println(Varias.juntaNumeros(x, p));
    }
}
