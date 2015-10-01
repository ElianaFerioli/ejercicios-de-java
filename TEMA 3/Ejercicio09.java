/**
 * 
 * @author Eliana Ferioli
 */

import java.util.Scanner;

public class Ejercicio09 {
  public static void main(String[] args) {    
    
    System.out.print("Introduce la altura del cono: ");
    double x1 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el radio del cono: ");
    double x2 = Double.parseDouble(System.console().readLine());
    
    double constante = 1.0/3.0* 3.14;
    double total = (constante * x2 * x2 * x1);
    
    System.out.printf("El volumen del cono es: %.2f", total);
  }
}
