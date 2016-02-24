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
public class Arrays {
    /**
    * Muestra array
    *
    * @param x un array de enteros
    */
    
    //Muestra array/////////////////////////////////////////////////////
    public static void muestraArraySinSeparacion(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }
        System.out.println();
    }
    
    /**
    * Muestra array
    *
    * @param x un array de enteros
    */
    
    //Muestra array/////////////////////////////////////////////////////
    public static void muestraArray(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "|");
        }
        System.out.println();
    }
    
    /**
    * Muestra array
    *
    * @param x un array de string
    */
    
    //Muestra array string//////////////////////////////////////////////////
    public static void muestraArrayString(String x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
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
    * Devuelve el mínimo del array que se pasa como parámetro.
    *
    * @param array un array int.
    * 
    * @return número entero positivo.
    *
    */
    
    //Minimo del array/////////////////////////////////////////////////////
    public static int minimoArrayInt(int array[]) {
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }    
        
        return min;
    }
    
    /**
    * Devuelve el máximo del array que se pasa como parámetro.
    *
    * @param array un array int.
    * 
    * @return número entero positivo.
    *
    */
    
    //Maximo del array/////////////////////////////////////////////////////
    public static int maximoArrayInt(int array[]) {
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }    
        
        return max;
    }
    
    /**
    * Devuelve la media del array que se pasa como parámetro.
    *
    * @param array un array int.
    * 
    * @return número que puede contener decimales.
    *
    */
    
    //Media del array/////////////////////////////////////////////////////
    public static double mediaArrayInt(int array[]) {
        double suma = 0;
        double contador = 0;
        
        
        for(int i = 0; i < array.length; i++) {
            suma = suma + array [i];
            contador++;
        }   
        
        double media = suma / contador;
        
        return media;
    }
    
    /**
    * Dice si un número está o no dentro de un array.
    *
    * @param array un array int.
    * @param n un array int.
    * 
    * @return verdadero o falso.
    *
    */
    
    //Busca un valor dentro de un array/////////////////////////////////////////////////////
    public static boolean estaEnArrayInt(int array[], int n) {        
        boolean esDentro = false;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == n) {
                esDentro = true;
            }
        }   
        
        return esDentro;
    }
    
    /**
    * Busca un número en un array y devuelve la posición (el índice)
    * en la que se encuentra.
    *
    * @param array un array int.
    * @param n un array int.
    *
    */
    
    //Busca un valor dentro de un array y da el indice////////////////////////
    public static void posicionEnArray(int array[], int n) {
        if(Arrays.estaEnArrayInt(array, n)) {
            System.out.println("El número " + n + " se encuentra en la posición: ");
            for(int i = 0; i < array.length; i++) {
                if(array[i] == n) {
                    System.out.print(i + "|");
                }
            }
        } else {
            System.out.println("El número no está en el array.");
        }
    }   
    /**
    * Le da la vuelta a un array.
    *
    * @param array un array int.
    *
    * @return array.
    * */
    
    //Le da la vuelta al array/////////////////////////////////////////////////////
    public static int[] volteaArrayInt(int array[]) {
        int contador = (array.length) - 1;
        for(int x = 0; x < contador; x++) {
            int aux = array[x];
            array[x] = array[contador];
            array[contador] = aux;
            contador--;
        }
        return array;
    }
    /**
    * Le da la vuelta a un array string.
    *
    * @param array un array String.
    *
    * @return array.
    * */
    
    //Le da la vuelta al array string///////////////////////////////////////////
    public static String[] volteaArrayString(String array[]) {
        int contador = (array.length) - 1;
        for(int x = 0; x < contador; x++) {
            String aux = array[x];
            array[x] = array[contador];
            array[contador] = aux;
            contador--;
        }
        return array;
    }

    
    /**
    * Rota n posiciones a la derecha los números de un array.
    *
    * @param array un array int.
    * @param posiciones un número entero positivo.
    *
    * @return array.
    * */
    
    //Rota el array a la derecha////////////////////////////////////////////////
    public static int[] rotaDerechaArrayInt(int array[], int posiciones) {
        int contador = (array.length) - 1;
           
        for (int i = 0; i < posiciones - 1; i ++){
            int aux = array[contador];
            for (int x = contador; x > 0; x--) {
                array[x] = array[x - 1];
            }
            array[0] = aux;
        }
        return array;
    }
    
    
    /**
    * Rota n posiciones a la izquierda los números de un array.
    *
    * @param array un array int.
    * @param posiciones un número entero positivo.
    *
    * @return array.
    * */
    
    //Rota el array a la izquierda////////////////////////////////////////////////
    public static int[] rotaIzquierdaArrayInt(int array[], int posiciones) {
        int contador = (array.length) - 1;
           
        for (int i = 0; i < posiciones - 1; i ++){
            int aux = array[0];
            for (int x = 0; x < contador; x++) {
                array[x] = array[x + 1];
            }
            array[contador] = aux;
        }
        return array;
    }
     /**
    * pega array
    *
    * @param x un array de enteros
    * @param i un array de enteros
    * @return int[]
    */
    
    //pega array/////////////////////////////////////////////////////
    public static int[] pegaArrayInt(int[] x, int [] i) {
        int longUno = x.length;
        int longDos = i.length;
        int[] nuevoArray = new int[longUno + longDos];
        int indice = 0;
        for(int j= 0; j < longUno; j++) {
            nuevoArray[indice] = x[j];
            indice++;
        }
        for(int j= 0; j < longDos; j++) {
            nuevoArray[indice] = i[j];
            indice++;
        }
        return nuevoArray;
    }
}
