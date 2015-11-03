/**
 * Escribe un programa que muestre 40 números enteros aleatorios comprendidos entre 200 y 500
ambos incluidos y separados por espacios. Muestra también el máximo de los pares, el mínimo de los
impares y la media de todos los números.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra 40 números enteros aleatorios entre 200 y 500.");
    
    int x = 1;
    int maximoPar = 0;
    int minimoImpar = 499;
    double suma = 0;
    
    while (x <= 40) {
      int numeroAleatorio = (int)(Math.random() *  500 - 200 + 1) + 200;
      System.out.print(numeroAleatorio + " ");
      if (((numeroAleatorio % 2) == 0) && (numeroAleatorio > maximoPar)) {
        maximoPar = numeroAleatorio;
      }
      if (((numeroAleatorio % 2) != 0) && (numeroAleatorio < minimoImpar)) {
        minimoImpar = numeroAleatorio;
      }
      suma = suma + numeroAleatorio;
      x++;
    }
    System.out.println();
    System.out.println("El máximo de los pares es: " + maximoPar);
    System.out.println("El mínimo de los impares es: " + minimoImpar);
    System.out.printf("La media es: %.2f", suma / 40.0);
  }
}
