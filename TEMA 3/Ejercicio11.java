/**
* Lectura de datos desde teclado usando la clase Scanner
*
* @author Luis J. Sánchez
*/

import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {    
    
    System.out.print("Introduce la cantidad de KB: ");
    int x1 = Integer.parseInt(System.console().readLine());        
    System.out.printf("La cantidad de MB es: %.3f", ((double)x1/1024));
  }
}
