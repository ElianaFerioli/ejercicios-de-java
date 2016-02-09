/*
 * Cuenta el número de dígitos de un número entero.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        System.out.println("Cuenta el número de dígitos de un número entero.");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        long num = Integer.parseInt(s.nextLine());

        System.out.print("La cantidad de dígitos es: ");
        System.out.println(Varias.cuentaDigitos(num));
    }
}
