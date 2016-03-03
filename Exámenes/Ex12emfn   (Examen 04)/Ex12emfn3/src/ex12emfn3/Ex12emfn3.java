/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12emfn3;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ex12emfn3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa mezcla dos números de tipo long.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        long numUno = Long.parseLong(s.nextLine());
        System.out.print("Por favor, introduzca otro número: ");
        long numDos = Long.parseLong(s.nextLine());
        System.out.println(mezclaAleatoria(numUno, numDos));
        
    }
    //////////////////////Funciones
    /**
    * Le añade a un número n un dígitos por delante (por la izquierda).
    *
    * @param num un número entero positivo
    * @param dig un número entero positivo
    * @return un entero
    */
    //Añade dígito por delante/////////////////////////////////////////////
    public static long agregaPorDelante(long num, long dig) {

        long x = num;
        int contador = 0;
        int divisor = 1;

        //Crea el divisor
        while(x > 0){
            x = x / 10;
            contador++;
        }
        while(contador > 0) {
            divisor = divisor *10;
            contador--;
        }

        //Crea un nuevo número poniéndole lo que el usuario pide
        x = (dig * divisor) + num;
        
        return x;
    }
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
    /**
    * Mezcla dos números de tipo long
    *
    * @param x un número entero long
    * @param y un número entero long
    * @return un entero
    */
    //Mezcla long/////////////////////////////////////////////
    public static long mezclaAleatoria(long x, long y) {
        long num = agregaPorDelante(x, y);
        //Crea un array con el número
        int[] array = convierteNumeroEnArray(num);
        //Mezcla el array
        int[] nuevoIndice = new int[array.length];
        int indice = (int)(Math.random()*array.length);
        boolean existe = false;
        nuevoIndice[0] = array[indice];
        for(int i = 0; i < array.length; i++) {
            do {
                indice = (int)(Math.random()*array.length);
                existe = false;
                for(int j = 0; j < i; j++) {
                    if(nuevoIndice[j]==indice) {
                        existe = true;
                    } 
                }
            } while (existe);
            nuevoIndice[i] = indice;
        }
        //Se le asignan valores a un nuevo array
        int[] nuevoArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            nuevoArray[i] = array[nuevoIndice[i]];
        }
        
        //Se tranforma el array en un número entero
        long nuevoNum = 0;
        for(int i = 0; i < nuevoArray.length; i++) {
            num = nuevoArray[i];
            nuevoNum = nuevoNum * 10 + num;
        }
        
        return nuevoNum;
    }
    
}
