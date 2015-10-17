/**
 * 
 *
 * @author Eliana Ferioli
 */
public class Ejercicio28 {
  public static void main(String[] args) {
    System.out.println("El programa calcula el factorial de un número entero introducido por teclado.");
    System.out.print("Por favor, introduzca un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    int factorial = 1;
    
    if (numero > 0) {
      for (int x = numero; x > 0; x--) {
        factorial = factorial * x;
      }
      System.out.println("El factorial del número introducido es: " + factorial);
    } else {
      for (int x = numero; x < 0; x++) {
        factorial = factorial * x;
      }
      System.out.println("El factorial del número introducido es: " + factorial);
    }
  }
}
