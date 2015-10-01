/**
* Lectura de datos desde teclado usando la clase Scanner
*
* @author Luis J. Sánchez
*/

import java.util.Scanner;

public class Ejercicio07 {
  public static void main(String[] args) {
    
    System.out.print("Introduce el total de la base imponible: ");
    double x1 = Double.parseDouble(System.console().readLine());        
    
    System.out.println("El total de la factura es: " + (x1 + (x1 * 21) / 100));
  }
}
