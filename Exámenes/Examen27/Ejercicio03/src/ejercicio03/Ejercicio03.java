/*
 * Crea una función con la siguiente cabecera:
 * long mezcla(long x, long y);
 * Esta función crea un número a partir de mezclar otros dos que se pasan como parámetros. Se va
 * cogiendo un dígito del primer número, otro del segundo número, otro del primero, etc.
 * Hay que tener en cuenta que los números que se mezclan pueden tener tamaños muy diferentes por
 * lo que, cuando se termine de coger dígitos de un número, se seguirán cogiendo del otro más grande.
 * Utiliza esta función en un programa para comprobar que funcionan bien.
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
        System.out.println("Estre programa mezcla dos número de tipo long");
        Scanner s = new Scanner (System.in);
        System.out.print("Por favor, introduzca el primer número: ");
        long numUno = Long.parseLong(s.nextLine());
        System.out.print("Por favor, introduzca el segundo número: ");
        long numDos = Long.parseLong(s.nextLine());
        System.out.print("El resultado es: ");
        System.out.println(Funciones.mezcla(numUno, numDos));
    }
    
}
