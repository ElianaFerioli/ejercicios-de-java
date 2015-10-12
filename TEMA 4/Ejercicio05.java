/**
*
* @author Eliana Ferioli
*/

public class Ejercicio05 {
  public static void main(String[] args) {
    System.out.println("Este programa resuelve ecuaciones de primer grado");
    
    System.out.print("Introduce la variable a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la variable b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    if (a == 0){
      System.out.println("No es posible resolver la ecuación.");
    } else {    
    System.out.println("El resultado de la ecuación es: " + (-b/a));
    }
  }
}
