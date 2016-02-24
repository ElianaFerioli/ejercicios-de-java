/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio29a34 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca las filas del array: ");
        int filas = Integer.parseInt(s.nextLine());     
        System.out.print("Introduzca las columnas del array: ");
        int columnas = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca el número máximo: ");
        int max = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca el número mínimo: " );
        int min = Integer.parseInt(s.nextLine());
        int[][] a = ArraysBi.generaArrayBiInt(filas, columnas, max, min);
        ArraysBi.muestraArrayBi(a);
        System.out.print("Introduzca el número de fila que desea conocer (empezando por 0): " );
        int fil = Integer.parseInt(s.nextLine());
        ArraysBi.filaDeArrayBiInt(a, fil);
        System.out.print("Introduzca el número de columna que desea conocer (empezando por 0): " );
        int col = Integer.parseInt(s.nextLine());
        ArraysBi.columnaDeArrayBiInt(a, col);
        System.out.print("Introduzca el número del que desea saber las coordenadas: " );
        int num = Integer.parseInt(s.nextLine());
        int[] arrayCoor = ArraysBi.coordenadasEnArrayBiInt(a, num);
        Arrays.muestraArray(arrayCoor);
        System.out.print("Introduzca un número para saber si es punto de silla: " );
        int sill = Integer.parseInt(s.nextLine());
        if(ArraysBi.esPuntoDeSilla(a, sill)) {
            System.out.println("El número "+ sill + " es punto de silla.");
        } else {
            System.out.println("El número " + sill + " no es punto de silla.");
        }
        System.out.print("Introduzca la fila de la diagonal que desea conocer: " );
        int filDiago = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca la columna de la diagonal que desea conocer: " );
        int colDiago = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca la dirección de la diagonal (nose o neso): " );
        String dir = s.nextLine();
        int[] diagonal = ArraysBi.diagonal(a, filDiago, colDiago, dir);
        Arrays.muestraArray(diagonal);     
        
    }
    
}
