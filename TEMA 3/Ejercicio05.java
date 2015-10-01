/**
 * 
 * @author Eliana Ferioli
 */

import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String[] args) {

    System.out.print("Introduce la base del rectángulo: ");
    double x1 = Double.parseDouble(System.console().readLine());        
    System.out.print("Introduce la altura del rectángulo: ");
    double x2 = Double.parseDouble(System.console().readLine());        
    
    System.out.println("El área del rectángulo es: " + (x1 * x2));
  }
}
