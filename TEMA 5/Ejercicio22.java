/**
 * 
 *
 * @author Eliana Ferioli
 */
public class Ejercicio22 {
  public static void main(String[] args) {
    System.out.println("EL programa mostrará todos los números primos comprendidos entre 2 y 100.");
    int cantidad = 0;
    int num = 0;
    
      for (int x = 2; x <= 100; x++) {
        int divisor = 1;
        while (divisor <= x) {
          if ((x % divisor) == 0) {
          cantidad++;
          }
          divisor++;
        }
        if (cantidad == 2) {
          System.out.println("El número " + x + " es primo.");
        }
      cantidad = 0;
      }
  }
}
