/**
*
* @author Eliana Ferioli
*/

public class Ejercicio06 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula el tiempo que tarda en caer un objeto desde una altura dada");
    
    System.out.print("Introduce la altura: ");
    double h = Double.parseDouble(System.console().readLine());
    
    double x = (2 * h)/9.81;
    
    System.out.printf("El tiempo que tarda en caer es: %.2f", Math.sqrt(x));
    System.out.println("m/s2");
  }
}
