/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ex12emfn4;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ex12emfn4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa convierne un array bidimensional en un array unidimensional");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca las filas del array: ");
        int filas = Integer.parseInt(s.nextLine());     
        System.out.print("Introduzca las columnas del array: ");
        int columnas = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca el número máximo: ");
        int max = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca el número mínimo: " );
        int min = Integer.parseInt(s.nextLine());
        int[][] a = generaArrayBiInt(filas, columnas, max, min);
        muestraArrayBi(a);
        System.out.println();
        System.out.println();
        desenrolla(a);
    }
    
    /////////////////////Funciones
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
    * Cuenta el número de dígitos de un número entero.
    *
    * @param num un número entero positivo de tipo long
    * @return un entero
    */
    
    //Cuenta dígitos/////////////////////////////////////////////////////
    public static int cuentaDigitos (long num) {
        int contador = 0;
        int digitos = 0;
        //Cuenta cuántas veces sepuede dividir hasta llegar a cero
        while(num > 0) {
            num = num/10;
            contador++;
        }

        //Establece cuántos dígitos tiene
        digitos = contador;
        return digitos;
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
    * Muestra un array bidimensional
    *
    * @param x un array bidimensional de enteros
    * 
    */
    
    //Muestra array bi/////////////////////////////////////////////////////
    public static void muestraArrayBi(int x[][]) {
        String formatoNumero = "%" + cuentaDigitos(maximoArrayIntBi(x)) + "d";
        for (int i = 0; i < numeroFilas(x); i++) {
            for (int j = 0; j < numeroColumnas(x); j++) {
                System.out.printf(formatoNumero + " ", x[i][j]);
            }
            System.out.println();
        }
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
    
    //Genera array bi/////////////////////////////////////////
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
    * convierte un array bidimensional en un array unidimensional
    *
    * @param n array bidimensional
    * 
    * 
    * @return un array unidimensional
    */
    
    //Desenrrolla array/////////////////////////////////////////
    public static int[] desenrolla(int[][] n) {
        //Crea el array unidimensional
        int[] unidimensional = new int[(numeroFilas(n)*numeroColumnas(n))];
        int indice = 0;
        //Va rotando el array bidimensional
        int cambioMarco = 0;

        for (int j = 1; j <= (numeroFilas(n)/2); j++) {
            int x = 0 + cambioMarco;
            //Rota línea superior
            for (int i = cambioMarco; i < (numeroColumnas(n)- cambioMarco); i++) {
                unidimensional[indice] = n[x][i];
                indice++;
            }
            //Rota línea derecha
            for (int i = cambioMarco + 1; i < (numeroFilas(n)- cambioMarco); i++) {
                unidimensional[indice] = n[i][(numeroColumnas(n) - 1) - cambioMarco];
                indice++;
            }
            //Rota línea inferior
            for (int i = (numeroColumnas(n)- 2)-cambioMarco; i >= cambioMarco; i--) {
                unidimensional[indice] = n[(numeroFilas(n)- 1)-cambioMarco][i];
                indice++;
            }
            //Rota línea izquierda
            for (int i = (numeroFilas(n)-2) - cambioMarco; i > cambioMarco; i--) {
                unidimensional[indice] = n[i][x];
                indice++;
            }
            
            cambioMarco++;
        }
        if((numeroFilas(n)%2)!=0) {
            for(int i = 0; i <= numeroColumnas(n)-numeroFilas(n); i++) {
                unidimensional[indice] = n[numeroFilas(n)/2][numeroFilas(n)/2 + i];
                indice++;
            }
            
        }
        muestraArray(unidimensional);
        return unidimensional;
    }
    
    
}
