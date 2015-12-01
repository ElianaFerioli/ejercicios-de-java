/**
 * Escribe un programa que muestre 40 números enteros aleatorios comprendidos entre 10 y 500 ambos
incluidos y separados por espacios. Muestra luego el máximo de los pares, el mínimo de los múltiplos
de 5 y la media de todos los números.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Este programa genera, aleatoriamente, 40 números aleatorios.");
    int max = 0;
    int min = 600;
    double suma = 0;
    
    System.out.print("Los números son: ");
    for(int x = 1; x <= 40; x++) {
      int num = (int)((Math.random() * 491) + 10);
      System.out.print(num + " ");
      if(((num % 2) == 0) && (num  > max)) {
        max = num;
      }
      if(((num % 5) == 0) && (num < min)) {
        min = num;
      } 
      suma = suma + num;
    }
    System.out.println();
    System.out.println("El máximo de los pares es: " + max);
    System.out.println("El minimo de los múltiplos de cinco es: " + min);
    System.out.printf("La media es: %.2f", suma/60.0);
  }
}
