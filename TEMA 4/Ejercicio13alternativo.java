/**
*
* @author Eliana Ferioli
*/

public class Ejercicio04alternativo {
  public static void main(String[] args) {
    System.out.println("Este programa ordena tres números introducidos por teclado.");
    
    System.out.print("Introduce el primer número: ");
    int x1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el segundo número: ");
    int x2 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el tercer número: ");
    int x3 = Integer.parseInt(System.console().readLine());
    
    int aux = 0;
    
    if (x1 > x2) {
      aux = x1;
      x1 = x2;
      x2 = aux;
    }
    if (x2 > x3) {
      aux = x2;
      x2 = x3;
      x3 = aux;
    }
    if (x1 > x2) {
      aux = x2;
      x2 = x1;
      x1 = aux;
    }

  System.out.println("Los números introducidos en orden son: " + x1 + "-" + x2 + "-" + x3);
  }
}
