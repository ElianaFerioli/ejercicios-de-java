/**
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los elementos
según la tabla que se muestra a continuación. Muestra el contenido de todos los elementos
del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?
 *
 * @author Eliana Ferioli
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra un array de 10 símbolos.");
    
    String simbolo[] = new String [10];
    
    simbolo [0] = "a";
    simbolo [1] = "x";
    simbolo [4] = "@";
    simbolo [6] = "''";
    simbolo [7] = "+";
    simbolo [8] = "Q";
    
    for (int x = 0; x < 10; x++) {
      System.out.println ("El simbolo " + x + " del array es: " + simbolo[x]);
    }       //los valores que no se inicializan java los pone a null.
  }
}
