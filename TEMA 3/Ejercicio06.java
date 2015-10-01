/**
* Lectura de datos desde teclado usando la clase Scanner
*
* @author Luis J. Sánchez
*/

import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args) {

    System.out.print("Introduce la base del triángulo: ");
    double x1 = Double.parseDouble(System.console().readLine());        
    System.out.print("Introduce la altura del triángulo: ");
    double x2 = Double.parseDouble(System.console().readLine());        
    
    System.out.println("El área del triángulo es: " + (x1 * x2) / 2);
  }
}
