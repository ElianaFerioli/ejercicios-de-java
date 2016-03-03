/*
 * Crea una función con la siguiente cabecera:
 * public String convierteEnMorse(int n)
 * Esta función convierte el número n al sistema Morse y lo devuelve en una cadena de caracteres. Por
 * ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en Morse.
 * Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se debe
 * mostrar nada por pantalla, solo se debe usar print desde el programa principal.
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
        System.out.println("Este programa convierte un número a código morse.");
        Scanner s = new Scanner (System.in);
        System.out.print("Por favor, introduzca un número: ");
        int numero = Integer.parseInt(s.nextLine());
        System.out.println("El número en morse es:");
        System.out.println(convierteEnMorse(numero));
        
    }
    
    ///////////////Funciones
    
    /**
    * Convierte en morse
    *
    * @param n un número entero
    * @return morse un string
    */
    
    //Devuelve morse/////////////////////////////////////////////////////
    public static String convierteEnMorse(int n) {
        String[] codigoMorse = new String [10];
        codigoMorse[0] = "_ _ _ _ _";
        codigoMorse[1] = ". _ _ _ _";
        codigoMorse[2] = ". . _ _ _";
        codigoMorse[3] = ". . . _ _";
        codigoMorse[4] = ". . . . _";
        codigoMorse[5] = ". . . . .";
        codigoMorse[6] = "_ . . . .";
        codigoMorse[7] = "_ _ . . .";
        codigoMorse[8] = "_ _ _ . .";
        codigoMorse[9] = "_ _ _ _ .";
        
        String morse= "";
        //Mide la longitud del número
        int contadorUno = 0;
        int numero = n;
        while (numero > 0) {
            numero = numero/10;
            contadorUno++;
        }
        //Crea el divisor
        int contadorDos = contadorUno;
        int divisor = 1;
        while(contadorUno > 1) {
            divisor = divisor * 10;
            contadorUno--;
        }
        //Crea el string morse
        while(contadorDos > 0) {
            int resultado = n / divisor;
            morse = morse + codigoMorse[resultado] + " ";
            n = n % divisor;
            divisor = divisor / 10;
            contadorDos--;
        }
        return morse;
    }
    
    
}
