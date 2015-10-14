/**
*
* @author Eliana Ferioli
*/

public class Ejercicio07 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula la media de tres notas.");
    System.out.println("Recuerda que las notas son numéricas y pueden contener decimales.");

    
    System.out.print("Introduce la primer nota: ");
    double x1 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la segunda nota: ");
    double x2 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la tercer nota: ");
    double x3 = Double.parseDouble(System.console().readLine());
    
      if ((x1 >=0) && (x1 <= 10) &&
        (x2 >=0) && (x2 <= 10) &&
        (x3 >=0) && (x3 <= 10)) {
        System.out.printf("La media de las tres notas es: %.2f", ((x1 + x2 + x3) / 3));
      } else {
        System.out.println("Alguna de las notas introducidas no son correctas");
      }
    }
}
