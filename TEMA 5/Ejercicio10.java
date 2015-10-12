/**
 * 
 *
 * @author ELiana Ferioli
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    
    System.out.println("Introduce números enteros positivos y se calculara la media.");
    System.out.println("Para dejar de introducir números, introduce un número nevativo.");
    System.out.println("Introduce números positivos: ");
    
    int num = 0;
    double dividendo = 0;
    double divisor = 0;

    do {
      num = Integer.parseInt(System.console().readLine());
      if (num >= 0) {
      dividendo = dividendo + num;
      divisor = divisor + 1;
      }
    } while (num >= 0);
    double total = (dividendo/divisor);
    System.out.printf("La media de los números introducidos es: %.2f", total); 
  }
}
