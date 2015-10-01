/**
 * 
 * @author Eliana Ferioli
 */

import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {    
    
    System.out.print("Introduce la cantidad de MB: ");
    int x1 = Integer.parseInt(System.console().readLine());        
    System.out.println("La cantidad de KB es: " + (x1*1024));
  }
}
