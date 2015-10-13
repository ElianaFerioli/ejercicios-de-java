/**
*
* @author Eliana Ferioli
*/

public class Ejercicio14 {
  public static void main(String[] args) {
     
    System.out.print("Introduce un número: ");
    int x1 = Integer.parseInt(System.console().readLine());
    
    if (x1 % 2==0) {
      System.out.println("El número introducido es par.");
    } else {
      System.out.println("El número introducido es impar.");
    }
    if (x1 % 5==0) {
      System.out.println("El número introducido es divisible por 5");
    } else {
      System.out.println("El número introducido no es divisible por 5");
    }
  }
}
