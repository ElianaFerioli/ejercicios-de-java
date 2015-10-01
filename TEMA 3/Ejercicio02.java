/**
 * 
 * @author Eliana Ferioli
 */

public class Ejercicio02 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce una cantidad de euros: ");
    int x = Integer.parseInt(System.console().readLine());

    System.out.printf("La cantidad de Pesetas es: %.1f", x * 166.38 );
 
  } 
}
