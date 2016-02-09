/*
 * Toma como parámetros las posiciones inicial y final dentro de un
 * número y devuelve el trozo correspondiente.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Toma como parámetros las posiciones inicial y final dentro de un\nnúmero y devuelve el trozo correspondiente.");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        int x = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca la posición inicial: ");
        int p = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca la posición final: ");
        int f = Integer.parseInt(s.nextLine());
        
        System.out.print("El número resultante es: ");
        System.out.println(Varias.trozoDeNumero(x, p, f));
    }
}
