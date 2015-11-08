/**
 * Escribe un programa que pida un número entero positivo por teclado y que muestre a continuación los
números desde el 1 al número introducido junto con su factorial.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula el factorial del número introducido.");
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int aux = 1;
    int factorial = 1;
    
    while (aux <= num) {
      for (int x = aux; x > 0; x--) {
        factorial = factorial * x;
        }
        System.out.println("!" + aux + "=" + " " + (factorial));
        aux++;
        factorial = 1;
    }
  }
}
