/*
 * Da la posición de la primera ocurrencia de un dígito dentro de
 * un número entero. Si no se encuentra, devuelve -1.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        System.out.println("Devuelve el dígito que está en la posición n de un número entero. Se\nempieza contando por el 0 y de izquierda a derecha.");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        int x = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca el dígito que quiere buscar: ");
        int p = Integer.parseInt(s.nextLine());
        
        System.out.print("El número está en la posición: ");
        System.out.println(Varias.posicionDeDigito(x, p));
    }
    
}
