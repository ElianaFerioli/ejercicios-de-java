/**
 * Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga 
 * lo que se especifica en los comentarios 
 * (puedes incluirla en tu propia biblioteca de rutinas):
 * int[ ] moda(int x[ ]); 
 * Devuelve un array con dos elementos. El primer elemento indica el número de
 * moda, es decir, el número que más se repite. El segundo elemento indica la
 * frecuencia, o sea, el número de veces que aparece el número de moda en
 * el array.
 * Utiliza estas funciones en un programa para comprobar que funcionan bien.
 * @author Eliana Ferioli
 */
package moda;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Moda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa dice cuál es el número de moda en un array unidimensional");
        System.out.print("Por favor, indique la longitud del array: ");
        int longitud = Integer.parseInt(s.nextLine());
        System.out.print("Por favor, indique el número mínimo del array: ");
        int minimo = Integer.parseInt(s.nextLine());
        System.out.print("Por favor, indique el número máximo del array: ");
        int maximo = Integer.parseInt(s.nextLine());
        int[] array = generaArrayInt(longitud, minimo, maximo);
        System.out.println("Este es el array: ");
        muestraArray(array);
        System.out.println("El número que se más se repite y su frecuencia es: ");
        int[] arrayModa = moda(array);
        muestraArray(arrayModa);
        
        
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
    * Devuelve un array con dos elementos. El primer elemento indica el número de
    * moda, es decir, el número que más se repite. El segundo elemento indica la
    * frecuencia, o sea, el número de veces que aparece el número de moda en
    * el array.
    *
    * @param x un array de enteros
    * @return array
    */
    
    //Moda/////////////////////////////////////////////////////
    public static int[] moda(int x[]) {
        
        //Busca las repeticiones número por número
        int frecuencia = 0;
        int numero = 0;
        for(int i = 0; i < x.length; i++) {
            int contador = 0;
            for(int j = 0; j < x.length; j++) {
                if(x[i] == x[j]) {
                    contador++;
                }
            }
            if(contador > frecuencia) {
                numero = x[i];
                frecuencia = contador;
            }
        }
        //crea el array moda
        int[] moda = new int[2];
        moda[0] = numero;
        moda[1] = frecuencia;
        
        //Devuelve el resultado
        return moda;
    }
}
