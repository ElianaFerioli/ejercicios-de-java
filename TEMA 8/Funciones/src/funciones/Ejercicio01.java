/*
 * Devuelve verdadero si el número que se pasa como parámetro es capicúa
 * y falso en caso contrario.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        System.out.println("Devuelve verdadero si el número que se pasa como parámetro es capicúa\ny falso en caso contrario.");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        int x = Integer.parseInt(s.nextLine());
        
        if(Varias.esCapicua(x)) {
            System.out.println("El número es capicúa");
        } else {
            System.out.println("El número no es capicúa");
        }
    }
    
    
}
