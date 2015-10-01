/**
 * 
 * @author Eliana Ferioli
 */

public class Ejercicio01 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int x;
    x = Integer.parseInt( linea );

    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
    int y;
    y = Integer.parseInt( linea );
    System.out.println("La multiplicacion de ambos números es " + x * y );
 
  } 
}
