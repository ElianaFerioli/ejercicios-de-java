/*
 * Crea dos funciones de manejo de arrays con las siguientes cabeceras:
 * int[ ][ ] eliminaFilaArrayBiInt(int x[ ][ ], int fila);
 * int[ ][ ] eliminaColumnaArrayBiInt(int x[ ][ ], int columna);
 * La primera devuelve un array con una fila menos. La fila que se quiere eliminar se indica en un
 * parámetro. La segunda función opera de forma análoga pero esta vez lo que se elimina es una
 * columna.
 * Utiliza estas funciones en un programa para comprobar que funcionan bien.
 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa elimina una fila o una columna de un array bidimensional");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, indique las filas del array: ");
        int filas = Integer.parseInt(s.nextLine());
        System.out.print("Por favor, indique las columnas del array: ");
        int columnas = Integer.parseInt(s.nextLine());
        System.out.println("Este es el array generado:");
        int[][] original = Funciones.generaArrayBiInt(filas, columnas, 50, 10);
        Funciones.muestraArrayBi(original);
        System.out.print("Por favor, indique la fila que quiere eliminar: ");
        int filaEliminada = Integer.parseInt(s.nextLine());
        System.out.println("Este es el array resultante:");
        int[][] sinFila = Funciones.eliminaFilaArrayBiInt(original, filaEliminada);
        Funciones.muestraArrayBi(sinFila);
        System.out.print("Por favor, indique la columna que quiere eliminar: ");
        int columnaEliminada = Integer.parseInt(s.nextLine());
        int[][] sinColumna = Funciones.eliminaColumnaArrayBiInt(original, columnaEliminada);
        Funciones.muestraArrayBi(sinColumna);
        
    }
    
}
