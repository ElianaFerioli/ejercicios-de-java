/**
 *Escribe un programa que muestre 45 números enteros aleatorios comprendidos entre 100 y 1000
ambos incluidos y separados por espacios. Muestra también el máximo de los múltiplos de 7, el
mínimo de los impares y la media de todos los números.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra 45 números aleatorios");
    int maximomultiplo = 100;
    int minimoImpar = 999;
    double suma = 0;
    
    System.out.println("Los números son: ");
    for (int x = 1; x <= 45; x++) {
      int numeroAleatorio = (int)((Math.random() * 901) + 100);
      System.out.print(numeroAleatorio + " ");
      
      if (((numeroAleatorio % 7) == 0) && (numeroAleatorio > maximomultiplo)) {
        maximomultiplo = numeroAleatorio;
      }
      if (((numeroAleatorio % 2) != 0) && (numeroAleatorio < minimoImpar)) {
        minimoImpar = numeroAleatorio;
      }
      
      suma = suma + numeroAleatorio;
    }
    
    System.out.println();
    System.out.println("El máximo múltiplo de siete es: " + maximomultiplo);
    System.out.println("El menor número impar es: " + minimoImpar);
    System.out.printf("La media de los número introducidos es : %.2f", (suma / 45));
  }
}
