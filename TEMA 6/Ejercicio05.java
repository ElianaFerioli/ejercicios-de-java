/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
espacios. Muestra también el máximo, el mínimo y la media de esos números.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra, al azar, 50 números entre 100 y 199.");
    int maximo = 0;
    int minimo = 199;
    int suma = 0;
    
    for(int x = 1; x <= 50; x++) {
      int num = (int)(Math.random() * 100) + 100;
      System.out.print(num + " ");
      if (num > maximo) {
        maximo = num;
      } else if (num < minimo) {
        minimo = num;
      }
      suma = suma + num;      
    }
    System.out.println();
    System.out.println("El menor de los números es: " + minimo);
    System.out.println("El mayor de los números es: " + maximo);
    System.out.printf("La media de los números es: %.2f", ((double)suma/50.0));

  }
}
