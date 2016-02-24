/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author eliana
 */
public class ArraysBi {
    /**
    * Devuelve el número de filas de un array bidimensional
    *
    * @param x un array bidimensional de enteros
    * @return numero entero positivo.
    */
    
    //Numero de filas array/////////////////////////////////////////////////////
    public static int numeroFilas(int x[][]) {
        return x.length;
    }
    /**
    * Devuelve el número de columnas de un array bidimensional
    *
    * @param x un array bidimensional de enteros
    * @return numero entero positivo.
    */
    
    //Numero de columnas array/////////////////////////////////////////////////////
    public static int numeroColumnas(int x[][]) {
        return x[0].length;
    }
    
    /**
    * Muestra un array bidimensional
    *
    * @param x un array bidimensional de enteros
    * 
    */
    
    //Muestra array bi/////////////////////////////////////////////////////
    public static void muestraArrayBi(int x[][]) {
        String formatoNumero = "%" + Varias.cuentaDigitos(maximoArrayIntBi(x)) + "d";
        for (int i = 0; i < numeroFilas(x); i++) {
            for (int j = 0; j < numeroColumnas(x); j++) {
                System.out.printf(formatoNumero + " ", x[i][j]);
            }
            System.out.println();
        }
    }
    /**
    * busca el máximo valor del array
    *
    * @param x un array bidimensional de enteros
    * 
    * @return numero entero positivo
    */
    
    //Muestra el máximo valor del array/////////////////////////////////////////
    public static int maximoArrayIntBi(int x[][]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numeroFilas(x); i++) {
            for (int j = 0; j < numeroColumnas(x); j++) {
                if(x[i][j] > max) {
                    max = x[i][j];
                }
            }
        }
        return max;
    }
    
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
    * Devuelve la fila i-ésima del array que se pasa como parámetro.
    *
    * @param x array bidimensional
    * @param fila numero entero positivo
    *
    * 
    */
    
    //Muestra la fila de un array/////////////////////////////////////////
    public static void filaDeArrayBiInt(int[][] x, int fila){
        System.out.print("La fila " + fila + " es: ");
        for (int j = 0; j < ArraysBi.numeroColumnas(x); j++) {
            System.out.print(x[fila][j] + "|");
        }
        System.out.println();        
    }
    
    /**
    * Devuelve la columna j-ésima del array que se pasa como
    * parámetro.
    *
    * @param x array bidimensional
    * @param columna numero entero positivo
    *
    * 
    */
    
    //Muestra la columna de un array/////////////////////////////////////////
    public static void columnaDeArrayBiInt(int[][] x, int columna){
        System.out.print("La columna " + columna + " es: ");
        for (int j = 0; j < ArraysBi.numeroFilas(x); j++) {
            System.out.print(x[j][columna] + "|");
        }
        System.out.println();        
    }
    
    /**
    * Devuelve la fila y la columna (en un array con dos
    * elementos) de la primera ocurrencia de un número dentro de un array bidimensional.
    * Si el número no se encuentra en el array, la función devuelve el array {-1, -1}.
    *
    * @param x array bidimensional
    * @param num numero entero positivo
    *
    * @return array  de coordenadas.
    */
    
    //Muestra las coordenadas de un número//////////////////////////////////////
    public static int[] coordenadasEnArrayBiInt(int[][] x, int num){
        int[] coordenadas = new int[2];
        boolean esIgual = false;
            for (int i = 0; (i < ArraysBi.numeroFilas(x) &&(!esIgual)); i++) {
                for (int j = 0; (j < ArraysBi.numeroColumnas(x)&&(!esIgual)); j++) {
                    if(x[i][j] == num) {
                        coordenadas[0] = i;
                        coordenadas[1] = j;
                        esIgual = true;
                    }
                }
        }
        if(!esIgual) {
          coordenadas[0] = -1;
          coordenadas[1] = -1;  
        }
       return coordenadas; 
    }
    
    /**
    * Dice si un número es o no punto de silla, es decir, mínimo en su
    * fila y máximo en su columna.
    *
    * @param x array bidimensional
    * @param num numero entero positivo
    *
    * @return true or false
    */
    
    //Determina si un número es un punto de silla///////////////////////////////
    public static boolean esPuntoDeSilla(int[][]x, int num){
       boolean esPunto = false;
       //busca la coordenada
       int[] arrayCoor = ArraysBi.coordenadasEnArrayBiInt(x, num);
       //crea un array unidimensional de su fila
       int[] fila = new int[ArraysBi.numeroColumnas(x)];
       for(int i = 0; i < ArraysBi.numeroColumnas(x); i++) {
           fila[i] = x[arrayCoor[0]][i];
       }
       //crea un array unidimensional de su columna
       int[] columna = new int[ArraysBi.numeroFilas(x)];
       for(int i = 0; i < ArraysBi.numeroFilas(x); i++) {
           columna[i] = x[i][arrayCoor[1]];
       }
       //Busca el minimo de la fila
       int min = Arrays.minimoArrayInt(fila);
       //Busca el máximo de la columna
       int max = Arrays.maximoArrayInt(columna);
       //Verifica si coincide
       if((num == min) && (num == max)) {
           esPunto = true;
       }
       return esPunto; 
    }
    
    /**
    * Devuelve un array que contiene una de las diagonales del array bidi-
    * mensional que se pasa como parámetro. Se pasan como parámetros fila, columna y
    * dirección. La fila y la columna determinan el número que marcará las dos posibles
    * diagonales dentro del array. La dirección es una cadena de caracteres que puede ser
    * “nose” o “neso”. La cadena “nose” indica que se elige la diagonal que va del noroeste
    * hacia el sureste, mientras que la cadena “neso” indica que se elige la diagonal que
    * va del noreste hacia el suroeste. 
    *
    * @param fila numero entero positivo
    * @param columna numero entero positivo
    * @param direccion cadena de caracteres
    * @param a array bidimensional.
    *
    * @return tarray unidimensional.
    */
    
    //Devuelve la diagonal del array///////////////////////////////
    public static int[] diagonal(int[][] a, int fila, int columna, String direccion) {
      //Determina el tamaño del array unidimensional
      int numFilas = ArraysBi.numeroFilas(a);
      int numColumnas = ArraysBi.numeroColumnas(a);
      int tamanio = 0;
      if(numFilas < numColumnas) {
          tamanio = numFilas - fila;
      } else {
          tamanio = numColumnas - columna;
      }
      
      int[] array = new int[tamanio];
      if(direccion.equals("nose")) {
      //crea un array unidimensional nose
        for(int i = 0; i < tamanio; i++) {
              array[i] = a[fila][columna];
              fila++;
              columna++;
          }
      }
      if(direccion.equals("neso")) {
        //crea un array unidimensional nose
        for(int i = 0; i < tamanio; i++) {
            array[i] = a[fila][columna];
            fila++;
            columna--;
        }
      }
        
      return array;
    }
    
    
}
