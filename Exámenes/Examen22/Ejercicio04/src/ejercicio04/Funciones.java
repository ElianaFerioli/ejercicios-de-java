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
    //Muestra array/////////////////////////////////////////////////////
    public static void muestraArray(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "|");
        }
        System.out.println();
    }
    /**
    * Genera un array de tamaño n con números aleatorios cuyo
    * intervalo (mínimo y máximo) se indica como parámetro.
    *
    * @param x un número entero positivo
    * @param minimo un número entero positivo
    * @param maximo un número entero positivo
    *@return array.
    */
    
    //Array aleatorio/////////////////////////////////////////////////////
    public static int[] generaArrayInt(int x, int minimo, int maximo) {
        int[] array = new int[x];

        for(int i = 0; i < x; i++) {
          array[i] = (int)((Math.random()*(maximo - minimo)+ 1) + minimo);
        }

        return array;
      }
    
    /**
    * Devuelve verdadero si el número que se pasa como parámetro es primo y
    * falso en caso contrario.
    *
    * @param num un número entero positivo
    * @return verdadero o falso
    */
    
    //Es primo////////////////////////////////////////////////////////
    public static boolean esPrimo(int num) {
        int x = 1;
        int resto = 0;
        int suma = 0;
        boolean esPrimo = false;

        //Verifica cuántas veces da de resto 0
        do {
          resto = num % x;
          if (resto == 0) {
            suma++;
          }
          x++;
        } while ((x <= num) && (num != 2));

        //Establece si es o no primo
        if ((suma == 2)||(num == 1)) {
            esPrimo = true;
        } 
        return esPrimo;
    }
    
    /**
    * Devuelve un array con todos los números primos que
    * se encuentren en otro array que se pasa como parámetro.
    * Obviamente el tamaño del array que se devuelve será menor o
    * igual al que se pasa como parámetro.
    *
    * @param x[] un array.
    *@return array.
    */
    
    //Devuelve array primos/////////////////////////////////////////////////////
    public static int[ ] filtraPrimos(int x[ ]) {
        //Recorre el array y se fija cuantos primos hay
        int contador = 0;
        boolean existenPrimos = false;
        for(int i = 0; i < x.length; i++) {
            if(Funciones.esPrimo(x[i])){
                contador++;
                existenPrimos = true;
            }
        }
        
        //Inicializa el array
        int indice = 0;
        if(existenPrimos) {
            indice = contador;
        } else {
            indice = 1;
        }
        int[] array = new int [indice];
        
        //Crea el array
        if(existenPrimos) {
            //Guarda en el nuevo array los primos
            indice = 0;
            for(int i = 0; i < x.length; i++) {
                if(Funciones.esPrimo(x[i])){
                    array[indice] = x[i];
                    indice++;
                }
            }
        } else {
            array[0] = -1;
        }
        return array;
    }
}
