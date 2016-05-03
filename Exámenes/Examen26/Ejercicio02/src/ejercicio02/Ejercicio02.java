/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        Scanner s = new Scanner (System.in);
        System.out.print("Por favor, indique qué término de la secuencia \"Look and say\" desea ver: ");
        int num = Integer.parseInt(s.nextLine());
        int termino = 0;
        int contador = 0;
        int divisor = 1;
                
        for (int x=  0; x <= num; x++) {
            if(x==0) {
                termino = 5654;
                System.out.println(termino + ", ");
            } else {
                divisor = termino;
                while(divisor > 0) {
                    divisor = divisor /10;
                    contador++;
                }
                divisor = 1;
                for(int i = 1; i < contador; i++) {
                    divisor = divisor * 10;
                }
                int[] lookAndSay = new int[contador];
                for(int i = 0; i < contador; i++) {
                    lookAndSay[i] = termino / divisor;
                    termino = termino % 10;
                    divisor = divisor / 10;
                }
                System.out.println(contador);
                System.out.println(divisor);

                
            }
        } 
        
    }
    
}
