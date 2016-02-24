/*
 * Crea una función con la siguiente cabecera:
 * public static String convierteEnPalotes(int n)
 * Esta función convierte el número n al sistema de palotes y lo devuelve en una cadena de caracteres.
 * Por ejemplo, el 470213 en decimal es el | | | | - | | | | | | | - - | | - | - | | | en el sistema de palotes. Utiliza
 * esta función en un programa para comprobar que funciona bien. Desde la función no se debe mostrar
 * nada por pantalla, solo se debe usar print desde el programa principal. 
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Este programa transforma un número al sistema de palotes.");
        System.out.print("Introduzca un número: ");
        int num = Integer.parseInt(s.nextLine());
        System.out.print("EL número en el sistema de palotes es: ");
        System.out.println(Funciones.convierteEnPalotes(num));
    }
    
}
