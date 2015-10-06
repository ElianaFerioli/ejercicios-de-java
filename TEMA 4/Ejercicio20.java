/**
*
* @author Eliana Ferioli
*/
public class Ejercicio20 {
  public static void main(String[] args) {
    System.out.println("Este programa descubre si un número es capicúa.\nSe permiten números de hasta cinco cifras.");
    
    System.out.print("Introduce un número: ");
    int x1 = Integer.parseInt(System.console().readLine());
    int numcifra = 0;
    
    if (x1 < 10) {
    System.out.println((x1) + ": No es capicúa");
    }
    if ((x1 >= 10) && (x1 < 100)) {
      if ((x1/10) == (x1 % 10)) {
      System.out.println((x1) + ": Es capicúa");
      } else {
         System.out.println((x1) + ": No es capicúa");
      }
    }
    if ((x1 >= 100) && (x1 < 1000)) {
      if ((x1 / 100) == (x1 % 10)) {
      System.out.println((x1) + ": Es capicúa");
      } else {
         System.out.println((x1) + ": No es capicúa");
      }
    }
    if ((x1 >= 1000) && (x1 < 10000)) {
      int primercifra = (x1 / 100);
      int segundacifra = (x1 % 100);
      if (((primercifra % 10) == (segundacifra / 10)) && ((primercifra / 10) == (segundacifra % 10))) {
      System.out.println((x1) + ": Es capicúa");
      } else {
         System.out.println((x1) + ": No es capicúa");
      }
    }
    if ((x1 >= 10000) && (x1 < 100000)) {
      int primercifra = (x1 / 1000);
      int segundacifra = (x1 % 100);
      if (((primercifra % 10) == (segundacifra / 10)) && ((primercifra / 10) == (segundacifra % 10))) {
      System.out.println((x1) + ": Es capicúa");
      } else {
         System.out.println((x1) + ": No es capicúa");
      }
    }
  }
}
    
    
