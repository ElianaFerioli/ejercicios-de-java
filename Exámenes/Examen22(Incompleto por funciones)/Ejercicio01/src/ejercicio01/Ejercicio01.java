/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

/**
 *
 * @author eliana
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] num = new int[10][10];
        //Rellena el array con números aleatorios
        for(int i = 0; i < 10; i++) {
            for(int x = 0; x < 10; x++) {
                num[i][x] = (int)(Math.random()*100) + 200;
            }
        }
        //Lo muestra
        System.out.print("         |");  
        for (int  x = 0; x < 10; x++) {
            System.out.print("  Columna " + x + "|");
        } //Imprime la cabecera de las columnas
          
        System.out.println();
        for(int i = 0;  i < 10; i++) {
            for (int x = 0; x < 11; x++) {
                if (x == 0) {
                    System.out.print("Fila   " + i + " |");
                } else {
                    System.out.print("     " +   num[i][x - 1]  + "    ");
                }
            }
            System.out.println();
        } 
        
        //Muestra la diagonal y calcula maximo, minimo y media
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int suma = 0;
        System.out.println("Los valores de la diagonal son: ");
        
        for(int i = 0; i < 10; i++) {
            for(int x = 0; x < 10; x++) {
                if (x == i) {
                    System.out.print(num[i][x] + "|");
                    if(num[x][i] > max) {
                        max = num[x][i];
                    }
                    if(num[x][i] < min) {
                        min = num[x][i];
                    }
                    suma = num[x][i] + suma;
                }
            }
        }
        
        //Muestra el máximo el mínimo y la media
        System.out.println();
        System.out.println("El máximo es: " + max);
        System.out.println("El mínimo es: " + min);
        System.out.println("La media es: " + (suma / 10));
        
        
        
        
        
    }
    
}
