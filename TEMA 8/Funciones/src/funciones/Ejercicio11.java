/*
 * Le añade a un número n un dígitos por detrás (por la derecha). in the editor.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Le añade a un número n un dígitos por detrás (por la derecha).");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        int x = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca el dígito que quiere agregar: ");
        int p = Integer.parseInt(s.nextLine());
        
        System.out.print("El número resultante es: ");
        System.out.println(Varias.agregaPorDetras(x, p));
    }
}
