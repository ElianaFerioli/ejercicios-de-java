/**
*
* @author Eliana Ferioli
*/

public class Ejercicio09 {
  public static void main(String[] args) {
    System.out.println("Este programa resuelve ecuaciones de segundo grado");
    
    System.out.print("Introduce la variable a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la variable b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la variable c: ");
    double c = Double.parseDouble(System.console().readLine());
    
    if (a == 0){
      System.out.println("El resultado de la ecuación es: " + (-c/b));
    } else if (b == 0){
      double discriminante = -c/a;
      if (discriminante < 0) {
        System.out.println("No es posible resolver la ecuación.");
      } else {
      System.out.printf("El resultado de la ecuación es: %.2f", Math.sqrt(discriminante));
      }
    } else if (c == 0) {
      System.out.println("El resultado de x1 es: 0");
      System.out.println("El resultado de x2 es: " + (-b/a));
    } else {      
      double parcialraiz = (Math.pow(b,2))-(4 * a * c);
      double parcialdivisor = 2 * a;        
        if (parcialraiz < 0) {
        System.out.println("No es posible resolver la ecuación.");
        } else {
        double parcialraizcompleta = Math.sqrt(parcialraiz);    
        double x1 = (-b + (parcialraizcompleta))/parcialdivisor;
        double x2 = (-b - (parcialraizcompleta))/parcialdivisor;    
        if (x1 == x2) {
          System.out.println("X es : " + x1);
        } else {
          System.out.println("X1 es " + x1);
          System.out.println("X2 es " + x2);
          }
        }
      }
  }
}
