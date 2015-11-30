/**
 * Escribe un programa que muestre 40 números enteros aleatorios comprendidos entre 10 y 500 ambos
incluidos y separados por espacios. Muestra luego el máximo de los pares, el mínimo de los múltiplos
de 5 y la media de todos los números.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra número aleatorios ente 10 y 500.");
    int maximoPar = 0;
    int minimoMultiplo = 500;
    double suma = 0;
    System.out.println("Los números son: ");
    
    for(int x = 1; x <= 40; x++) {
      int numeroAleatorio = (int)((Math.random() * 491) + 10);
      System.out.print(numeroAleatorio + " ");
      if (((numeroAleatorio % 2) == 0) && (numeroAleatorio > maximoPar)) {
        maximoPar =  numeroAleatorio;
      }
      if (((numeroAleatorio % 5) == 0) && (numeroAleatorio < minimoMultiplo)) {
        minimoMultiplo = numeroAleatorio;
      }
      suma = suma + numeroAleatorio;
    }
    System.out.println();
    System.out.println("El mayor de los números pares es: " + maximoPar);
    System.out.println("El menos de los múltiplos de cinco es: " + minimoMultiplo);
    System.out.printf("La media de los número introducidos es: %.2f", (suma/40.0));
  }
}
