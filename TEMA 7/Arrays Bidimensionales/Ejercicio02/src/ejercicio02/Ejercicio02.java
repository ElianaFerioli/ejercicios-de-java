/*
 * Escribe un programa que pida 20 números enteros. Estos números se deben introducir en
 * un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y
 * columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la
 * esquina inferior derecha.
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        System.out.println("Este programa recoge números en un array bidimensional y los suma.");
        System.out.println("Por favor, ingrese los números del array de cuatro filas y dos columnas:");
           int [] [] num = new int [4] [5];
           Scanner s = new Scanner (System.in);
           int sumatotal = 0;
           
           for (int x = 0;  x < 4; x++) {
                for(int i = 0; i < 5; i++) {
                    System.out.print("Fila " + x + " y columna " + i + ": ");
                    num [x] [i] = Integer.parseInt(s.nextLine());
                }
            } //Pide los números
           
           
        System.out.print("         |");  
        for (int  x = 0; x < 6; x++) {
           if (x < 5) {
            System.out.print("Columna " + x + "|");
           } else {
            System.out.print("Sumatorio|"); 
           }
        } //Imprime la cabecera de las columnas
          
        System.out.println();
          
        int sumafila = 0;
        for(int i = 0;  i < 4; i++) {
            for (int x = 0; x < 7; x++) {
                if (x == 0) {
                    System.out.print("Fila   " + i + " |");
                } else if ((x >= 1) && (x < 6)){
                    System.out.print("     " +   num[i][x - 1]  + "    ");
                    sumafila = sumafila + num[i][x - 1];
                } else{
                    System.out.print("   " +sumafila);
                }
            }
            System.out.println();
            sumafila = 0;
        } //Imprime cada fila y su sumatorio
       
        
        System.out.print("Sumatorio|"); 
        for(int x = 0; x < 5; x++) {
            int sumacolumnas = 0;
            for(int i = 0; i < 4; i++){
                sumacolumnas = sumacolumnas + num[i][x];
            }
            sumatotal = sumacolumnas + sumatotal;
            System.out.print("    " + sumacolumnas + "    "); 
        } //IMprime los sumatorios de las columnas y calcula el sumatorio total
       
        System.out.print("   " + sumatotal + "    ");
        //Imprime el sumatorio total
       
    }     
}
