/**
 *Escribe un programa que muestre 50 números enteros aleatorios comprendidos entre el -100 y el 200
ambos incluidos y separados por espacios. Muestra luego el máximo de los pares y el mínimo de los
impares.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Este programa genera números aleatorios.");
    int max = -100;
    int min = 200;
    
    System.out.print("Los números son: ");
    for (int x = 1; x <= 50; x++) {
      int num = (int)((Math.random() * 301) - 100);
      if (((num % 2) == 0) && (num > max)) {
        max = num;
      }
      if (((num % 2) != 0) && (num < min)) {
        min = num;
      }
      System.out.print(num + " ");
    }
    
    System.out.println();
    System.out.println("El mayor de los pares es: " + max);
    System.out.println("El menor de los impares es: " + min);
  }
}
