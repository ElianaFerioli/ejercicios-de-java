/**
 *Escribe un programa que muestre 40 números enteros aleatorios comprendidos entre 200 y 500
ambos incluidos y separados por espacios. Muestra también el máximo de los pares, el mínimo de los
impares y la media de todos los números.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra 40 números aleatorios.");
    int max = 0;
    int min = 500;
    double suma = 0;
    
    System.out.println("Los números son: ");
    for (int x = 1; x <= 40; x++) {
      int num = (int)((Math.random() * 301) + 200);
      System.out.print(num + " ");
      if (((num % 2) == 0) && (num > max)) {
        max = num;
      }
      if (((num % 2 != 0) && (num < min))) {
        min = num;
      }
      suma = suma + num;
    }
    System.out.println("El máximo de los pares es: " + max);
    System.out.println("El mínimo de los impares es: " + min);
    System.out.printf("La media de los números es: %.2f", suma/40.0);
  }
}
