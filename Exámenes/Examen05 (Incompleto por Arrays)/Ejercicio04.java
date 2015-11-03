/**
 * Escribe un programa que muestre 60 números enteros aleatorios comprendidos entre 300 y 600
ambos incluidos y separados por espacios. Muestra también el máximo de los múltiplos de 3, el
mínimo de los pares y la media de todos los números.
 * @author Eliana Ferioli
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra 60 números enteros aleatorios entre 300 y 600.");
    int maximoMultiplo = 0;
    int minimoPar = 600;
    double suma = 0;
    
    for (int x = 1; x <= 60; x++) {
      int numeroAleatorio = (int)((Math.random() * 301) + 300);
      System.out.print(numeroAleatorio + " ");
      if (((numeroAleatorio % 3) == 0) && (numeroAleatorio > maximoMultiplo)) {
        maximoMultiplo = numeroAleatorio;
      }
      if (((numeroAleatorio % 2) == 0) && (numeroAleatorio < minimoPar)) {
        minimoPar = numeroAleatorio;
      }
      suma = suma + numeroAleatorio;
    }
    System.out.println("El máximo múltiplo de tres es: " + maximoMultiplo);
    System.out.println("El mínimoimo par es: " + minimoPar);
    System.out.printf("La media de los números introducido es: %.2f", suma/40.0);
  }
}


    
