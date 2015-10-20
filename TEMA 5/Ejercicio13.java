/**
 * 
 *
 * @author Eliana Ferioli
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Por favor, introducir diez números:");
    int x = 1;
    int positivos = 0;
    int negativos = 0;
      do {
        System.out.print( x + "º número: ");
        int num = Integer.parseInt(System.console().readLine());
        if (num >= 0) {
          positivos++;
        } else {
          negativos++;
        }
        x++;
      } while (x <= 10);
    System.out.println("La cantidad de números positivos introducida es: " + positivos);
    System.out.println("La cantidad de números negativos introducida es: " + negativos);
  }
}
