/**
 *Escribe un programa que muestre 60 números enteros aleatorios comprendidos entre 300 y 600
ambos incluidos y separados por espacios. Muestra también el máximo de los múltiplos de 3, el
mínimo de los pares y la media de todos los números.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra 45 números aleatorios");
    int maximomultiplo = 300;
    int minimopar = 600;
    double suma = 0;
    
    System.out.println("Los números son: ");
    for (int x = 1; x <= 60; x++) {
      int numeroAleatorio = (int)((Math.random() * 301) + 300);
      System.out.print(numeroAleatorio + " ");
      
      if (((numeroAleatorio % 3) == 0) && (numeroAleatorio > maximomultiplo)) {
        maximomultiplo = numeroAleatorio;
      }
      if (((numeroAleatorio % 2) == 0) && (numeroAleatorio < minimopar)) {
        minimopar = numeroAleatorio;
      }
      
      suma = suma + numeroAleatorio;
    }
    
    System.out.println();
    System.out.println("El máximo múltiplo de tres es: " + maximomultiplo);
    System.out.println("El menor número par es: " + minimopar);
    System.out.printf("La media de los número introducidos es : %.2f", (suma / 45));
  }
}
