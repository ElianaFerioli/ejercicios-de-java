/*
 * Le quita a un número n dígitos por delante (por la izquierda).
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Le quita a un número n dígitos por delante (por la izquierda).");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        int x = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca la cantidad de dígitos que quiere sacar: ");
        int p = Integer.parseInt(s.nextLine());
        
        System.out.print("El número resultante es: ");
        System.out.println(Varias.quitaPorDelante(x, p));
    }
}
