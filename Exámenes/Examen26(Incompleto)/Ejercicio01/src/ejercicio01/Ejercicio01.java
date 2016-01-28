/*
 * Escribe un programa que construya un array con m filas y n columnas cuyos valores son los números
1, 2, 3, 4, ... , m x n acomodados en diagonal en sentido noreste → suroeste. Los valores de m y n
que introduzca el usuario deberán ser mayores o iguales a 2.
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio01 {

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
        int numero = 1;
        int iteraciones = (fila + columna) - 1;
        int cambioColumna = 0;
        int cambioFila = 0;
        //Rellena el array en sentido NO-SE
        while(iteraciones > 0) {
            int c = cambioColumna;
            int f = cambioFila;
            while((c >= 0)&&(c < columna)&&(f < fila)) {
                num[f][c] = numero;
                c--;
                f++;
                numero++;
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
