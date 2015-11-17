/**
 * Define un array de 12 números enteros con nombre num y asigna los valores según la tabla
que se muestra a continuación. Muestra el contenido de todos los elementos del array. ¿Qué
sucede con los valores de los elementos que no han sido inicializados?
 *
 * @author Eliana Ferioli
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra un array de 12 números enteros.");
    
    int num[] = new int [12];
    
    num [0] = 39;
    num [1] = -2;
    num [4] = 0;
    num [6] = 14;
    num [8] = 5;
    num [9] = 120;
    
    for (int x = 0; x < 12; x++) {
      System.out.println ("El elemento " + x + " del array es: " + num[x]);
    }       //los valores que no se inicializan java los pone a 0.
  }
}
