/**
 *Escribe un programa que muestre 50 números enteros aleatorios comprendidos entre el -100 y el 200
ambos incluidos y separados por espacios. Muestra luego el máximo de los pares el mínimo de los
impares y la media de todos los números generados.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra 50 números aleatorios.");
    
    int maximoPar = -100;
    int minimoImpar = 199;
    double suma = 0;
    
    System.out.println("Los números aleatorios son: ");
    
    for (int x = 1; x <= 50; x++) {
       int numAleatorio = (int)(Math.random() * 301) - 100;
       System.out.print(numAleatorio + " ");
       
       if (((numAleatorio % 2) == 0) && (numAleatorio > maximoPar)) {
         maximoPar = numAleatorio;
       }
       if (((numAleatorio % 2) != 0) && (numAleatorio < minimoImpar)) {
        minimoImpar = numAleatorio;
       }
       suma = suma + numAleatorio;
    }
    
    System.out.println();
    System.out.println("El máximo de los pares es: " + maximoPar);
    System.out.println("El minimo de los impares es: " + minimoImpar);
    System.out.printf("La media de los números generados es: %.2f", (suma / 50.0));
  }
}
