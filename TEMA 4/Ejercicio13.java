/**
*
* @author Eliana Ferioli
*/

public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Este programa ordena tres números introducidos por teclado.");
    
    System.out.print("Introduce el primer número: ");
    int x1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el segundo número: ");
    int x2 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el tercer número: ");
    int x3 = Integer.parseInt(System.console().readLine());
    
    int primernumero = 0;
    int segundonumero = 0;
    int tercernumero = 0;
    
    if ((x1 > x2) && (x1 >x3)) {
      tercernumero = x1;
    } else {
      if ((x2 > x1) && (x2 > x3)) {
        tercernumero = x2;
      }
      if ((x3 > x1) && (x3 > x2)) {
        tercernumero = x3;
      }
    }
    if ((x1 < x2) && (x1 < x3)) {
      primernumero = x1;
    } else {
      if ((x2 < x1) && (x2 < x3)) {
      primernumero = x2;
      }
      if ((x3 < x1) && (x3 < x2)) {
      primernumero = x3;
      }
    }
    if (((x1 > x2) && (x1 < x3)) || ((x1 < x2) && (x1 > x3))) {
      segundonumero = x1;
    } else {
      if (((x2 > x1) && (x2 < x3)) || ((x2 < x1) && (x2 > x3))) {
      segundonumero = x2;
      }
      if (((x3 > x1) && (x3 < x2)) || ((x3 < x1) && (x3 > x2))) {
      segundonumero = x3;
      }
    }
  System.out.println("Los números introducidos en orden son: " + primernumero + "-" + segundonumero + "-" + tercernumero);
  }
}
