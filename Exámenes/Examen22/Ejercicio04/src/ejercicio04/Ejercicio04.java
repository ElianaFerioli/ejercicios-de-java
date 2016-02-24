/*
 * Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga lo que se especifica
 * en los comentarios (puedes incluirla en tu propia biblioteca de rutinas):
 * public static int[ ] filtraPrimos(int x[ ]) // Devuelve un array con todos los números primos que
 * // se encuentren en otro array que se pasa como parámetro.
 * // Obviamente el tamaño del array que se devuelve será menor o
 * // igual al que se pasa como parámetro.
 * Utiliza esta función en un programa para comprobar que funcionan bien. Para que el ejercicio resulte
 * más fácil, las repeticiones de primos se conservan; es decir, si en el array x el número 13 se repite 3
 * veces, en el array devuelto también estará repetido 3 veces. Si no existe ningún número primo en x,
 * se devuelve un array con el número -1 como único elemento
 */
package ejercicio04;

/**
 *
 * @author eliana
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa genera un array aleatorio y lo toma como parámetro\npara crear otro en el que se incluyen solo los números primos.");
        System.out.println("El aray generado es: ");
        int[] a = Funciones.generaArrayInt(10, 10, 20);
        Funciones.muestraArray(a);
        System.out.println("El array resultante es: ");
        int[] b = Funciones.filtraPrimos(a);
        Funciones.muestraArray(b);
    }
    
}
