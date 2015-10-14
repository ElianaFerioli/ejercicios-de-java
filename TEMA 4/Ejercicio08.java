/**
*
* @author Eliana Ferioli
*/

public class Ejercicio08 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula la media de tres notas.");
    
    System.out.print("Introduce la primer nota: ");
    double x1 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la segunda nota: ");
    double x2 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la tercer nota: ");
    double x3 = Double.parseDouble(System.console().readLine());
    
    double notamedia = ((x1 + x2 + x3) / 3);
    if ((x1 >=0) && (x1 <= 10) &&
        (x2 >=0) && (x2 <= 10) &&
        (x3 >=0) && (x3 <= 10)) {
        if ((notamedia >= 0) && (notamedia < 5)) {
          System.out.println("La nota del boletin es: insuficiente");
        } else if ((notamedia >= 5) && (notamedia < 6)) {
          System.out.println("La nota del boletin es: suficiente");
        } else if ((notamedia >= 6) && (notamedia < 7)) {
          System.out.println("La nota del boletin es: bien");
        } else if ((notamedia >= 7) && (notamedia < 9)) {
          System.out.println("La nota del boletin es: notable");
        } else if ((notamedia >= 9) && (notamedia <= 10)) {
          System.out.println("La nota del boletin es: sobresaliente");
        } 
    } else {
      System.out.println("Alguna de las notas introducidas no son correctas");
    }
    }      
  }
