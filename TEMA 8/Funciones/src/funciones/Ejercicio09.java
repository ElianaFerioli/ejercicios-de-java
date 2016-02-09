/*
 * Le quita a un número n dígitos por detrás (por la derecha).
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        System.out.println("Le quita a un número n dígitos por detrás (por la derecha).");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        int x = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca la cantidad de dígitos que quiere sacar: ");
        int p = Integer.parseInt(s.nextLine());
        
        System.out.print("El número resultante es: ");
        System.out.println(Varias.quitaPorDetras(x, p));
    }
}
