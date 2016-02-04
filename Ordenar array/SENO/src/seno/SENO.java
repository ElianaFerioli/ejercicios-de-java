/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seno;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class SENO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pide el número de filas y de columnas
        Scanner s = new Scanner (System.in);
        System.out.print("Por favor, introduzca el número de filas: ");
        int fila = Integer.parseInt(s.nextLine());
        System.out.print("Por favor, introduzca el número de columnas: ");
        int columna = Integer.parseInt(s.nextLine());
        //Inicializa el array
        int[][] num = new int[fila][columna];
        int numero = fila * columna;
        int iteraciones = (fila + columna) - 1;
        int cambioColumna = 0;
        int cambioFila = 0;
        //Rellena el array en sentido NO-SE
        while(iteraciones > 0) {
            int c = cambioColumna;
            int f = cambioFila;
            while((c >= 0)&&(f < fila)) {
                num[f][c] = numero;
                c--;
                f++;
                numero--;
            }
            if (iteraciones > fila) {
                cambioColumna++;
            } else {
                cambioFila++;
            }
            iteraciones--;
            
            
        } 
        
        //Pinta el array
        System.out.println("Array");
        System.out.println("--------------");
        for(int i = 0; i < fila; i++) {
            for(int j = 0; j < columna; j++) {
                System.out.printf("%5d", num[i][j]);
            }
            System.out.println();
        }
    }
    
}
