/**
*
* @author Eliana Ferioli
*/
public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.println("Este programa descubre cuál es la última cifra del número introducido.");
    
    System.out.print("Introduce un número: ");
    long x1 = Long.parseLong(System.console().readLine());
    System.out.println("La última cifra es: " + (x1 % 10));
  }
}
