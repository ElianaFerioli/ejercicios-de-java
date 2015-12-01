/**
 * Escribe un programa que muestre 60 números enteros aleatorios comprendidos entre 300 y 600
ambos incluidos y separados por espacios. Muestra también el máximo de los múltiplos de 3, el
mínimo de los pares y la media de todos los números.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Este programa genera, aleatoriamente, 60n números aleatorios.");
    int max = 0;
    int min = 600;
    double suma = 0;
    
    System.out.print("Los números son: ");
    for(int x = 1; x <= 60; x++) {
      int num = (int)((Math.random() * 301) + 300);
      System.out.print(num + " ");
      if(((num % 3) == 0) && (num  > max)) {
        max = num;
      }
      if(((num % 2) == 0) && (num < min)) {
        min = num;
      } 
      suma = suma + num;
    }
    System.out.println();
    System.out.println("El máximo de los múltiplos de tres es: " + max);
    System.out.println("El minimo de los pares es: " + min);
    System.out.printf("La media es: %.2f", suma/60.0);
  }
}
