/**
* Lectura de datos desde teclado usando la clase Scanner
*
* @author Luis J. Sánchez
*/

import java.util.Scanner;

public class Ejercicio04 {
  public static void main(String[] args){


    System.out.print("Introduce un número: ");
    int x1 = Integer.parseInt(System.console().readLine());        
    System.out.print("Introduce otro número: ");
    int x2 = Integer.parseInt(System.console().readLine());        
    
    System.out.println("La suma de estos números es " + (x1 + x2));
    System.out.println("La resta de estos números es " + (x1 - x2));
    System.out.println("La multiplicación de estos números es " + x1 * x2);
    System.out.println("La división de estos números es " + x1 / x2);



  }
}
