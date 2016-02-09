/*
 * Dada una base y un exponente devuelve la potencia.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        System.out.println("Dada una base y un exponente devuelve la potencia.");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca una base: ");
        int base = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca un exponente: ");
        int exponente = Integer.parseInt(s.nextLine());

        System.out.print("La potencia es: ");
        System.out.println(Varias.potencia(base, exponente));
    }
    
}
