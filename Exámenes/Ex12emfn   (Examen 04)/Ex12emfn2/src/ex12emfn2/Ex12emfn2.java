/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12emfn2;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ex12emfn2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa convierte un número entero en un array.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        long num = Long.parseLong(s.nextLine());
        int[] arrayFinal = convierteNumeroEnArray(num);
        muestraArray(arrayFinal);
        
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
    
    ////////////////////////////////////////////////////////Funciones
    /**
    * Cuenta el número de dígitos de un número entero.
    *
    * @param num un número entero positivo de tipo long
    * @return un entero
    */
    
    //Cuenta dígitos//////////////////
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
    * Dada una base y un exponente devuelve la potencia.
    *
    * @param base un número entero positivo
    * @param exponente un número entero positivo
    * @return un entero
    */
    
    //Potencia/////////////////////////////////////////////////////
    public static int potencia(int base, int exponente) {
        int potencia = 1;
        //Calcula la potencia
        if (base == 0) {
           potencia = 0;
        } else {
            for (int i = 0; i < exponente; i++) {
                potencia = potencia * base;
            }
        }
        return potencia;
    }
    /**
    * Devuelve el dígito que está en la posición n de un número entero. Se
    * empieza contando por el 0 y de izquierda a derecha.
    *
    * @param x un número entero positivo
    * @param p un número entero positivo
    * @return un entero
    */
    
    //Dígito N/////////////////////////////////////////////////////
    public static int digitoN(int x, int p) {
    int pos = p;
    int num = x;
    int contador = 0;
    int digito = 0;
    
    //Cuenta cuántas veces sepuede dividir hasta llegar a cero
    contador = cuentaDigitos(num);
    //Crea el divisor
    int divisor = potencia(10, (contador - 1));
    
    //Busca el dígito
    contador = 0;
    while(contador <= pos) {
        digito = num / divisor;
        num = num % divisor;
        divisor = divisor / 10;
        contador++;
    }
    
    //El numero digito es num
    return digito;
    }
    /**
    * transforma long en array
    *
    * @param n int de número
    * @return array 
    */
    //Pasa int a array/////////////////////////////////////////
    public static int[] convierteNumeroEnArray(long n) {
        int longitud = cuentaDigitos(n);
        int[] array = new int[longitud];
        int indice = 0;
        while(longitud>0) {
            array[indice] = digitoN((int)n, indice);
            longitud--;
            indice++;
        }
        return array;
    }
}
