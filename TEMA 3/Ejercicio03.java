/**
 * 
 * @author Eliana Ferioli
 */

public class Ejercicio03 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce una cantidad de pesetas: ");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt( linea );

    System.out.printf("La cantidad de Euros es: %.1f", x / 166.38 );
 
  } 
}
