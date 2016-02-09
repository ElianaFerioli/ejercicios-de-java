/*
 * Le añade a un número n un dígitos por delante (por la izquierda).
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Le añade a un número n un dígitos por delante (por la izquierda).");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        int x = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca el dígito que quiere agregar: ");
        int p = Integer.parseInt(s.nextLine());
        
        System.out.print("El número resultante es: ");
        System.out.println(Varias.agregaPorDelante(x, p));
    }
}
