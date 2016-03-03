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
    
    
    public static long mezcla(long x, long y) {
        //Averigua la longitud de los números
        long numUno = x;
        long numDos = y;
        int contadorUno = 0;
        while(x > 0) {
            x = x / 10;
            contadorUno++;
        }
        int contadorDos = 0;
        while(y > 0) {
            y = y / 10;
            contadorDos++;
        }
        
        //Verifica cuál es el número de menor longitud
        int limite = 0;
        boolean esMenor = false;
        if(contadorUno >= contadorDos) {
            limite = contadorDos * 2;
            esMenor = true;
        } else {
            limite = contadorUno * 2;
        }
        
        
        //Crea los divisores de los números
        int divisorUno = 1;
        while(contadorUno > 1) {
            divisorUno = divisorUno * 10;
            contadorUno--;
        }
        int divisorDos = 1;
        while(contadorDos > 1) {
            divisorDos = divisorDos * 10;
            contadorDos--;
        }
        
        //Mezcla los números
        long nuevoNum = 0;
        for(int i = 0; i < limite; i++) {
            nuevoNum = nuevoNum * 10;
            if((i%2)==0) {
                long digito = numUno / divisorUno;
                numUno = numUno % divisorUno;
                divisorUno = divisorUno / 10;
                nuevoNum = nuevoNum + digito;
            } else {
                long digito = numDos / divisorDos;
                numDos = numDos % divisorDos;
                divisorDos = divisorDos / 10;
                nuevoNum = nuevoNum + digito;
            }  
        }
        
        if(esMenor) {
            while(divisorUno > 0) {
                nuevoNum = nuevoNum * 10;
                long digito = numUno / divisorUno;
                numUno = numUno % divisorUno;
                divisorUno = divisorUno / 10;
                nuevoNum = nuevoNum + digito;
            }
        } else {
            while(divisorDos > 0) {
               nuevoNum = nuevoNum * 10;
               long digito = numDos / divisorDos;
               numDos = numDos % divisorDos;
               divisorDos = divisorDos / 10;
               nuevoNum = nuevoNum + digito;
            }
        } 
      return nuevoNum;  
    }
}
