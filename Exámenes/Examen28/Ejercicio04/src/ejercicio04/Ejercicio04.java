/*
 * Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga lo que se especifica
 * en los comentarios (puedes incluirla en tu propia biblioteca de rutinas):
 * public int[ ] filtraCapicuas(int x[ ]) //
 * Devuelve un array con todos los números capicúa que
 * se encuentren en otro array que se pasa como parámetro.
 * obviamente el tamaño del array que se devuelve será menor o
 * igual al que se pasa como parámetro.
 * //
 * Utiliza esta función en un programa para comprobar que funcionan bien. Para que el ejercicio resulte
 * más fácil, las repeticiones de números capicúa se conservan; es decir, si en el array x el número 505
 * se repite 3 veces, en el array devuelto también estará repetido 3 veces. Si no existe ningún número
 * capicúa en x, se devuelve un array con el número -1 como único elemento.
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
        System.out.println("Este programa devuelve un array de números capicúas a partir de otro array que se pasa como parámetro");
        Scanner s = new Scanner (System.in);
        System.out.print("Por favor introduzca la longitud del array: ");
        int longitud = Integer.parseInt(s.nextLine());
        System.out.print("Por favor, introduca el número mínimo del array: ");
        int minimo = Integer.parseInt(s.nextLine());
        System.out.print("Por favor, introduca el número máximo del array: ");
        int maximo = Integer.parseInt(s.nextLine());
        int[] arrayOriginal = generaArrayInt(longitud, minimo, maximo);
        System.out.println("El array generado es: ");
        muestraArray(arrayOriginal);
        int[] arrayCapicua = filtraCapicuas(arrayOriginal);
        System.out.println("El array generado es: ");
        muestraArray(arrayCapicua);
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
    * Devuelve verdadero si el número que se pasa como parámetro es capicúa
    * y falso en caso contrario.
    *
    * @param x un número entero positivo
    * @return verdadero o falso
    */
    
    //Es Capicúa/////////////////////////////////////////////////////
    
    public static boolean esCapicua(int x) {
        int numeroOriginal = x;
        int volteado = 0;
        boolean  esCapicua =  false;
        
        //Le da la vuelta al número
        while (x > 0) {
          volteado = (volteado * 10) + (x % 10);
          x /= 10;
        }
        
        //Comprueba si es capicúa
        if(numeroOriginal == volteado) {
            esCapicua = true;
        }
        
        return esCapicua;
    }
    /**
    * Devuelve un array con todos los números capicúas que
    * se encuentren en otro array que se pasa como parámetro.
    * Obviamente el tamaño del array que se devuelve será menor o
    * igual al que se pasa como parámetro.
    *
    * @param x[] un array.
    *@return array.
    */
    
    //Devuelve array capicuas///////////////////////////////////////////////////
    public static int[ ] filtraCapicuas(int x[ ]) {
        //Recorre el array y se fija cuantos capicuas hay
        int contador = 0;
        boolean existenCapicuas = false;
        for(int i = 0; i < x.length; i++) {
            if(esCapicua(x[i])){
                contador++;
                existenCapicuas = true;
            }
        }
        
        //Inicializa el array
        int indice = 0;
        if(existenCapicuas) {
            indice = contador;
        } else {
            indice = 1;
        }
        int[] array = new int [indice];
        
        //Crea el array
        if(existenCapicuas) {
            //Guarda en el nuevo array los capicuas
            indice = 0;
            for(int i = 0; i < x.length; i++) {
                if(esCapicua(x[i])){
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
