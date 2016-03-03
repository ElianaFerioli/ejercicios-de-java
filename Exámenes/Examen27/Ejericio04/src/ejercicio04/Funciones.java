/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

/**
 *
 * @author eliana
 */
public class Funciones {
    /**
    * Genera un array bidimensional de forma aleatoria
    *
    * @param filas numero entero positivo
    * @param columnas numero entero positivo
    * @param maximo numero entero positivo
    * @param minimo numero entero positivo
    * 
    * @return numero entero positivo
    */
    
    //Muestra el máximo valor del array/////////////////////////////////////////
    public static int[][] generaArrayBiInt(int filas, int columnas, int maximo, int minimo ){
        int[][] array = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array[i][j] = (int)((Math.random()*(maximo - minimo)+ 1) + minimo);
            }
        }
        return array;
    }
    
    /**
    * Muestra un array bidimensional
    *
    * @param x un array bidimensional de enteros
    * 
    */
    
    //Muestra array bi/////////////////////////////////////////////////////
    public static void muestraArrayBi(int x[][]) {
        String formatoNumero = "%" + 4 + "d";
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.printf(formatoNumero + " ", x[i][j]);
            }
            System.out.println();
        }
    }
    
    /**
    * Elimina una fila del array
    *
    * @param x[][] array bidimensional
    * @param fila numero entero positivo
    * 
    * @return array[][]
    */
    
    //Elimina una fila del array/////////////////////////////////////////
    public static int[ ][ ] eliminaFilaArrayBiInt(int x[ ][ ], int fila) {
        //Inicializa el nuevo array
        int[][] array = new int[x.length - 1][x[0].length];
        
        //Elimina la fila
        int indiceFila = 0;
        for(int i = 0; i < x.length; i++) {
            if(i!=fila){
                for(int j = 0; j < x[0].length; j++){
                    array[indiceFila][j] = x[i][j];
                }
                indiceFila++;
            }
        }
        return array;
    }
    
    /**
    * Elimina una columna del array
    *
    * @param x[][] array bidimensional
    * @param columna numero entero positivo
    * 
    * @return array[][]
    */
    
    //Elimina una fila del array/////////////////////////////////////////
    public static int[ ][ ] eliminaColumnaArrayBiInt(int x[ ][ ], int columna) {
        //Inicializa el nuevo array
        int[][] array = new int[x.length][x[0].length - 1];
        
        //Elimina la fila
        for(int i = 0; i < x.length; i++) {
            int indiceColumna = 0;
                for(int j = 0; j < x[0].length; j++){
                    if(j!=columna){
                        array[i][indiceColumna] = x[i][j];
                        indiceColumna++;
                    }
                }
        }
        return array;
    }
    
}
