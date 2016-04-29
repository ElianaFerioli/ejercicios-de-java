/*
 * Crea la función letraNIF con la siguiente cabecera:
 * public static String letraNIF(int dni) // Devuelve la letra que le corresponde al número
 * de DNI que se pasa como parámetro.
 * Utiliza esta función en un programa para comprobar que funciona bien. La letra del NIF se obtiene aplicando la
 * operación de módulo 23 (resto de la división entera entre 23) al número del DNI. El resultado es un número
 * comprendido entre el 0 y el 22. En base a la siguiente tabla se asigna la letra.
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa devuelve la letra de un número de DNI.");
        Scanner s = new Scanner (System.in);
        System.out.print("Por favor introduzca un nímero de DNI: ");
        int dni = Integer.parseInt(s.nextLine());
        System.out.println("La letra es: " + Funciones.letraNIF(dni));
    }
    
}
