/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

/**
 *
 * @author eliana
 */
public class Funciones {
    public static String convierteEnPalotes(int n) {
        String palotes= "";
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
        
        //Crea el string palotes
        while(contadorDos > 0) {
            int resultado = n / divisor;
            for(int x = 0; x < resultado; x++) {
                palotes = palotes + "|";
            }
            if(contadorDos != 1) {
                palotes = palotes + "-";
            }
            n = n % divisor;
            divisor = divisor / 10;
            contadorDos--;
        }
    
        return palotes;
    }
}
